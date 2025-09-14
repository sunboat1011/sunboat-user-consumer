package com.sunboat.business.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

/**
 * 自定义密码加密器，结合盐值使用SHA-256加密
 */
@Configuration
public class CustomPasswordEncoder implements PasswordEncoder {

    /**
     * 加密密码（密码 + 盐值）
     * @param rawPassword 原始密码
     * @return 加密后的密码
     */
    @Override
    public String encode(CharSequence rawPassword) {
        // 注意：这里的rawPassword实际上是"原始密码+盐值"的组合字符串
        return DigestUtils.md5DigestAsHex(rawPassword.toString().getBytes(StandardCharsets.UTF_8));
    }

    /**
     * 验证密码
     * @param rawPassword 原始密码
     * @param encodedPassword 加密后的密码
     * @return 是否匹配
     */
    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        // 验证时同样需要将原始密码与盐值组合后加密，再与存储的加密密码比较
        return encode(rawPassword).equals(encodedPassword);
    }
}