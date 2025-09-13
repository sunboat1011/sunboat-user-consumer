package com.sunboat.business.rpc;

import com.sunboat.business.service.IUsersService;
import com.sunboat.common.dto.UserRegisterDTO;
import com.sunboat.common.result.InnerResult;
import com.sunboat.common.rpcService.UserRpcService;
import com.sunboat.common.vo.UsersVO;

public class UserRpcServiceImpl implements UserRpcService {

    private IUsersService usersService;

    @Override
    public InnerResult<UsersVO> register(UserRegisterDTO registerDTO) {
        return usersService.register(registerDTO);
    }
}
