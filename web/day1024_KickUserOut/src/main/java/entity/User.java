package entity;

import lombok.Data;

import java.util.Date;

/**
 * Package-name: entity
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 23-10-2023  03:24
 * Describe：
 */

@Data
public class User {
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
    private Date createTime;
    private Date updateTime;
    // ... Other fields and getters/setters
}
