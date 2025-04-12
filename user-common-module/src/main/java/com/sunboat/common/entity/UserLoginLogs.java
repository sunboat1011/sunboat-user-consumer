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
 * 用户登录记录表，用于记录用户的登录信息
 * </p>
 *
 * @author Sunboat
 * @since 2025-04-10
 */
@Getter
@Setter
@TableName("user_login_logs")
public class UserLoginLogs implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 登录记录的唯一标识，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 登录用户的 ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 用户登录时间，默认值为当前时间
     */
    @TableField("login_time")
    private LocalDateTime loginTime;

    /**
     * 用户登录的 IP 地址，可为空
     */
    @TableField("ip_address")
    private String ipAddress;

    /**
     * 用户登录使用的客户端信息，可为空
     */
    @TableField("user_agent")
    private String userAgent;

    /**
     * 用户登录状态，如成功、失败等，不能为空
     */
    @TableField("login_status")
    private String loginStatus;

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
