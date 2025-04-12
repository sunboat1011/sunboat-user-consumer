package com.sunboat.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunboat.business.maper.RolesMapper;
import com.sunboat.business.service.IRolesService;
import com.sunboat.common.entity.Roles;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色表，用于定义系统中不同的用户角色 服务实现类
 * </p>
 *
 * @author Sunboat
 * @since 2025-04-10
 */
@Service
public class RolesServiceImpl extends ServiceImpl<RolesMapper, Roles> implements IRolesService {

}
