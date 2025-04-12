package com.sunboat.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunboat.business.maper.UserRolesMapper;
import com.sunboat.business.service.IUserRolesService;
import com.sunboat.common.entity.UserRoles;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 - 角色关联表，用于建立用户和角色之间的多对多关系 服务实现类
 * </p>
 *
 * @author Sunboat
 * @since 2025-04-10
 */
@Service
public class UserRolesServiceImpl extends ServiceImpl<UserRolesMapper, UserRoles> implements IUserRolesService {

}
