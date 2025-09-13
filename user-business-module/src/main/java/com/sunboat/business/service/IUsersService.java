package com.sunboat.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunboat.common.dto.UserRegisterDTO;
import com.sunboat.common.entity.Users;
import com.sunboat.common.result.InnerResult;
import com.sunboat.common.vo.UsersVO;

/**
 * <p>
 * 用户表，用于存储系统中用户的基本信息 服务类
 * </p>
 *
 * @author Sunboat
 * @since 2025-04-10
 */
public interface IUsersService extends IService<Users> {

    InnerResult<UsersVO> register(UserRegisterDTO registerDTO);

}