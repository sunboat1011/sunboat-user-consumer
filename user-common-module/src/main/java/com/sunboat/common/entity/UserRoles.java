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
 * 用户 - 角色关联表，用于建立用户和角色之间的多对多关系
 * </p>
 *
 * @author Sunboat
 * @since 2025-04-10
 */
@Getter
@Setter
@TableName("user_roles")
public class UserRoles implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 关联记录的唯一标识，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 关联的用户 ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 关联的角色 ID
     */
    @TableField("role_id")
    private Long roleId;

    /**
     * 逻辑删除标记，0 表示未删除，1 表示已删除
     */
    @TableField("is_deleted")
    private Boolean isDeleted;

    /**
     * 角色分配给用户的时间，默认值为当前时间
     */
    @TableField("assigned_at")
    private LocalDateTime assignedAt;

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
