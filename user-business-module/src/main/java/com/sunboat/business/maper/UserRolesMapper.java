package com.sunboat.business.maper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunboat.common.entity.UserRoles;

/**
 * <p>
 * 用户 - 角色关联表，用于建立用户和角色之间的多对多关系 Mapper 接口
 * </p>
 *
 * @author Sunboat
 * @since 2025-04-10
 */
public interface UserRolesMapper extends BaseMapper<UserRoles> {

}
