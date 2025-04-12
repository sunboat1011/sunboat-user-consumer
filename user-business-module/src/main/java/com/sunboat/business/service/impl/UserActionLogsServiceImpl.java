package com.sunboat.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunboat.business.maper.UserActionLogsMapper;
import com.sunboat.business.service.IUserActionLogsService;
import com.sunboat.common.entity.UserActionLogs;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户操作记录表，用于记录用户在系统中的操作信息 服务实现类
 * </p>
 *
 * @author Sunboat
 * @since 2025-04-10
 */
@Service
public class UserActionLogsServiceImpl extends ServiceImpl<UserActionLogsMapper, UserActionLogs> implements IUserActionLogsService {

}
