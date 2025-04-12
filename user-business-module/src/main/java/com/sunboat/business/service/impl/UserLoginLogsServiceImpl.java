package com.sunboat.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunboat.business.maper.UserLoginLogsMapper;
import com.sunboat.business.service.IUserLoginLogsService;
import com.sunboat.common.entity.UserLoginLogs;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表，用于记录用户的登录信息 服务实现类
 * </p>
 *
 * @author Sunboat
 * @since 2025-04-10
 */
@Service
public class UserLoginLogsServiceImpl extends ServiceImpl<UserLoginLogsMapper, UserLoginLogs> implements IUserLoginLogsService {

}
