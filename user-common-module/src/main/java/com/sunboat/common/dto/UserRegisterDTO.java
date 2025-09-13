package com.sunboat.common.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;


@Data
public class UserRegisterDTO implements Serializable {

    private static final long serialVersionUID = 1L;


    private String username;
    private String password;
//    private String email;
    private String phone;
    private String fullName;
    private String gender;
    private LocalDate birthDate;
    private String profileImage;
    

}