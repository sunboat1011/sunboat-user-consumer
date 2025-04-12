package com.sunboat.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 权限表，用于定义系统中的各种权限
 * </p>
 *
 * @author Sunboat
 * @since 2025-04-10
 */
@Getter
@Setter
@TableName("permissions")
public class Permissions implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 权限唯一标识，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 权限名称，如用户管理、订单查看等，必须唯一且不能为空
     */
    @TableField("permission_name")
    private String permissionName;

    /**
     * 权限描述信息，可为空
     */
    @TableField("description")
    private String description;

    /**
     * 权限类型，如菜单权限、按钮权限、普通权限等，不能为空
     */
    @TableField("permission_type")
    private String permissionType;

    /**
     * 权限所属的组，可为空
     */
    @TableField("permission_group")
    private String permissionGroup;

    /**
     * 父权限的 ID，用于构建权限的层级关系，可为空
     */
    @TableField("parent_id")
    private Long parentId;

    /**
     * 权限的排序顺序，用于菜单或权限列表的展示，默认为 0
     */
    @TableField("sort_order")
    private Integer sortOrder;

    /**
     * 权限是否激活，0 表示未激活，1 表示激活
     */
    @TableField("is_active")
    private Boolean isActive;

    /**
     * 该权限是否需要对数据进行脱敏处理，0 表示否，1 表示是
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
