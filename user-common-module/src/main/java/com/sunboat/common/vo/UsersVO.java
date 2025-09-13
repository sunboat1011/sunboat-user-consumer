package com.sunboat.common.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 用户信息展示对象（VO）
 */
@Getter
@Setter
public class UsersVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String username;
    private String email;
    private String phone;
    private String fullName;
    private String gender;
    private LocalDate birthDate;
    private String profileImage;
    private Boolean isActive;
    private LocalDateTime expireAt;
    private LocalDateTime createdAt;
    private String createdFrom;
    private LocalDateTime updatedAt;
    private String updatedFrom;
}
