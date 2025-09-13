package com.sunboat.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunboat.business.config.CustomPasswordEncoder;
import com.sunboat.business.maper.UsersMapper;
import com.sunboat.business.service.IUsersService;
import com.sunboat.common.core.exception.BusinessException;
import com.sunboat.common.dto.UserRegisterDTO;
import com.sunboat.common.entity.Users;
import com.sunboat.common.result.InnerResult;
import com.sunboat.common.vo.UsersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * <p>
 * 用户表，用于存储系统中用户的基本信息 服务实现类
 * </p>
 *
 * @author Sunboat
 * @since 2025-04-10
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

    @Autowired
    private CustomPasswordEncoder customPasswordEncoder;


    @Override
    public InnerResult<UsersVO> register(UserRegisterDTO registerDTO) {
        // 验证用户名是否已存在
        Users userByPhone = this.lambdaQuery().eq(Users::getPhone,registerDTO.getPhone()).one();
        if (userByPhone != null) {
            throw new BusinessException("手机号已被注册");
        }


        // 生成盐值
        String salt = generateSalt();

        // 5. 密码加密（密码 + 盐值）
        String encodedPassword = customPasswordEncoder.encode(registerDTO.getPassword() + salt);

        // 6. 构建用户实体
        Users user = new Users();
        user.setUsername(registerDTO.getUsername());
        user.setPassword(encodedPassword);
        user.setSalt(salt);

        user.setPhone(registerDTO.getPhone());
        user.setFullName(registerDTO.getFullName());
        user.setGender(registerDTO.getGender());
        user.setBirthDate(registerDTO.getBirthDate());
        user.setProfileImage(registerDTO.getProfileImage());
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        // 7. 保存用户信息到数据库
        boolean save = this.save(user);

        if (!save) {
            throw new BusinessException("注册失败，请稍后重试");
        }
        return InnerResult.success();
    }




    /**
     * 生成随机盐值
     */
    private String generateSalt() {
        // 生成一个随机的32位字符串作为盐值
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 32);
    }
}
