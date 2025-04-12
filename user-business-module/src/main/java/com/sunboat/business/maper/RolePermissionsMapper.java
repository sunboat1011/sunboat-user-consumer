package com.sunboat.business.maper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunboat.common.entity.RolePermissions;

/**
 * <p>
 * 角色 - 权限关联表，用于建立角色和权限之间的多对多关系 Mapper 接口
 * </p>
 *
 * @author Sunboat
 * @since 2025-04-10
 */
public interface RolePermissionsMapper extends BaseMapper<RolePermissions> {

}
