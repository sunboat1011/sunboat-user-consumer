package com.sunboat.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunboat.business.maper.PermissionsMapper;
import com.sunboat.business.service.IPermissionsService;
import com.sunboat.common.entity.Permissions;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限表，用于定义系统中的各种权限 服务实现类
 * </p>
 *
 * @author Sunboat
 * @since 2025-04-10
 */
@Service
public class PermissionsServiceImpl extends ServiceImpl<PermissionsMapper, Permissions> implements IPermissionsService {

}
