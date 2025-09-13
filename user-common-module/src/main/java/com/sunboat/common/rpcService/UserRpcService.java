package com.sunboat.common.rpcService;

import com.sunboat.common.dto.UserRegisterDTO;
import com.sunboat.common.result.InnerResult;
import com.sunboat.common.vo.UsersVO;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0")
public interface UserRpcService {

    /**
     * 用户注册
     * @param registerDTO 注册信息DTO
     * @return 注册成功的用户信息
     */
    InnerResult<UsersVO> register(UserRegisterDTO registerDTO);

}
