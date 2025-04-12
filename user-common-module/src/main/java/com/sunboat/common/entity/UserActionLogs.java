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
 * 用户操作记录表，用于记录用户在系统中的操作信息
 * </p>
 *
 * @author Sunboat
 * @since 2025-04-10
 */
@Getter
@Setter
@TableName("user_action_logs")
public class UserActionLogs implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 操作记录的唯一标识，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 执行操作的用户 ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 用户操作时间，默认值为当前时间
     */
    @TableField("action_time")
    private LocalDateTime actionTime;

    /**
     * 用户操作类型，如创建、更新、删除等，不能为空
     */
    @TableField("action_type")
    private String actionType;

    /**
     * 用户操作的描述信息，可为空
     */
    @TableField("action_description")
    private String actionDescription;

    /**
     * 用户操作的目标表名，可为空
     */
    @TableField("target_table")
    private String targetTable;

    /**
     * 用户操作的目标记录 ID，可为空
     */
    @TableField("target_id")
    private Long targetId;

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
