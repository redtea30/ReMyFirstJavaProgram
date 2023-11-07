package com.mybatis.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Package-name: com.mybatis.dao
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 01-11-2023  12:12
 * Describe：
 */

@Data
public class UserInfoModel implements Serializable {
        private Long id;
        private String username;
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
