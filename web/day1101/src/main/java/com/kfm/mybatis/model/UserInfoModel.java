package com.kfm.mybatis.model;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * Package-name: com.kfm.mybatis
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 01-11-2023  10:31
 * Describe：
 */

@Data
public class UserInfoModel implements Serializable {
    /**
     * 主键
     */
    private String id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 加密后的密码
     */
    private String password;
    /**
     * 真实姓名
     */
    private String name;
    /**
     * 性别，1男，0女
     */
    private Boolean gender;
    /**
     * 出生年月
     */
    private Date birthday;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * QQ
     */
    private String qq;
    /**
     * 头像
     */
    private String img;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 更新时间
     */
    private Date updateDate;
    /**
     * 账号状态，1为正常，默认为1
     */
    private Integer state;
    /**
     * 1为已删除，0为未删除
     */
    private Boolean isDel;
    @Serial
    private static final long serialVersionUID = 1L;

}
