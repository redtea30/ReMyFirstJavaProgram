package com.mybatis.dao;

import com.mybatis.model.UserInfoModel;

import java.util.List;

/**
 * Package-name: com.mybatis.dao
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 01-11-2023  17:28
 * Describe：
 */

public interface UpdateUser {

    public int deleteOneUser(String username);

    public UserInfoModel selectOneUser(String username, String password);
    public UserInfoModel selectOneUser1(String username, String password);

    public int insertOneuser(String username, String password, String email);

    /**
     * 1102测试新东西
     */
    public List<UserInfoModel> selectTest();


}
