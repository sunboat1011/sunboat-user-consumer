package com.sunboat.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunboat.business.maper.UsersMapper;
import com.sunboat.business.service.IUsersService;
import com.sunboat.common.entity.Users;
import org.springframework.stereotype.Service;

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

}
