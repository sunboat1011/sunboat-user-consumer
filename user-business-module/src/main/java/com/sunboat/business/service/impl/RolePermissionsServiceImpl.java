package com.sunboat.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunboat.business.maper.RolePermissionsMapper;
import com.sunboat.business.service.IRolePermissionsService;
import com.sunboat.common.entity.RolePermissions;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色 - 权限关联表，用于建立角色和权限之间的多对多关系 服务实现类
 * </p>
 *
 * @author Sunboat
 * @since 2025-04-10
 */
@Service
public class RolePermissionsServiceImpl extends ServiceImpl<RolePermissionsMapper, RolePermissions> implements IRolePermissionsService {

}
