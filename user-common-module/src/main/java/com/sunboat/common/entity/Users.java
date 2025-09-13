package com.sunboat.common.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户表，用于存储系统中用户的基本信息
 * </p>
 *
 * @author Sunboat
 * @since 2025-04-10
 */
@Getter
@Setter
@TableName("users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户唯一标识，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名，用于登录系统，必须唯一且不能为空
     */
    @TableField("username")
    private String username;

    /**
     * 用户密码，经过加密存储，不能为空
     */
    @TableField("password")
    private String password;

    /**
     * 密码盐值，用于增强密码安全性，必须唯一且不能为空
     */
    @TableField("salt")
    private String salt;

    /**
     * 用户邮箱，可用于找回密码等操作，必须唯一且不能为空
     */
    @TableField("email")
    private String email;

    /**
     * 用户手机号码，必须唯一且不能为空
     */
    @TableField("phone")
    private String phone;

    /**
     * 用户全名，不能为空
     */
    @TableField("full_name")
    private String fullName;

    /**
     * 用户性别，M 表示男性，F 表示女性，可为空
     */
    @TableField("gender")
    private String gender;

    /**
     * 用户出生日期，可为空
     */
    @TableField("birth_date")
    private LocalDate birthDate;

    /**
     * 用户头像的存储路径，可为空
     */
    @TableField("profile_image")
    private String profileImage;

    /**
     * 用户账户是否激活，0 表示未激活，1 表示激活
     */
    @TableField("is_active")
    private Boolean isActive;

    /**
     * 逻辑删除标记，0 表示未删除，1 表示已删除
     */
    @TableField("is_deleted")
    @TableLogic
    private Boolean isDeleted;

    /**
     * 用户账户到期时间
     */
    @TableField("expire_at")
    private LocalDateTime expireAt;

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
