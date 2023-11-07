package com.mybatis.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Package-name: com.mybatis
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 02-11-2023  22:28
 * Describe：
 */

@Data
public class UserModel implements Serializable {
    private Long id;
    private String userName;
    private String nickName;
    private String password;
    private String status;
    private String email;
    private String phoneNumber;
    private String sex;
    private String avatar;
    private String userType;
    private Long createdBy;
    private Date createTime;
    private Long updatedBy;
    private Date updateTime;
    private Integer delFlag;
}
