package com.sunboat.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户角色表，用于定义系统中不同的用户角色
 * </p>
 *
 * @author Sunboat
 * @since 2025-04-10
 */
@Getter
@Setter
@TableName("roles")
public class Roles implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色唯一标识，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 角色名称，如管理员、普通用户等，必须唯一且不能为空
     */
    @TableField("role_name")
    private String roleName;

    /**
     * 角色描述信息，可为空
     */
    @TableField("description")
    private String description;

    /**
     * 是否为系统预设角色，0 表示否，1 表示是
     */
    @TableField("is_system_role")
    private Boolean isSystemRole;

    /**
     * 该角色是否默认需要对数据进行脱敏处理，0 表示否，1 表示是
     */
    @TableField("is_desensitized")
    private Boolean isDesensitized;

    /**
     * 逻辑删除标记，0 表示未删除，1 表示已删除
     */
    @TableField("is_deleted")
    private Boolean isDeleted;

    /**
     * 记录创建者的 ID
     */
    @TableField("create_id")
    private Long createId;

    /**
     * 记录创建时间
     */
    @TableField("created_at")
    private LocalDateTime createdAt;

    /**
     * 记录创建来源
     */
    @TableField("created_from")
    private String createdFrom;

    /**
     * 记录修改者的 ID
     */
    @TableField("update_id")
    private Long updateId;

    /**
     * 记录更新时间
     */
    @TableField("updated_at")
    private LocalDateTime updatedAt;

    /**
     * 记录更新来源
     */
    @TableField("updated_from")
    private String updatedFrom;
}
