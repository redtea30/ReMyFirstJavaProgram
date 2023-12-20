package pojo;

import lombok.Data;

import java.util.Date;

/**
 * Package-name: pojo
 * Project-name: ReMyFirstJavaProgram
 * Author: Neko
 * 15-12-2023  18:16
 * Describe：
 */
@Data
public class SysUser {
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
    private Long createBy;
    private Date createTime;
    private Long updateBy;
    private Date updateTime;
    private Integer delFlag;
}