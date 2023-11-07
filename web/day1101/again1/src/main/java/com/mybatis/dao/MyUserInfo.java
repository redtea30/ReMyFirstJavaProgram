package com.mybatis.dao;

import com.mybatis.model.UserInfoModel;

import java.util.List;

/**
 * Package-name: com.mybatis.dao
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 01-11-2023  11:51
 * Describe：
 */

public interface MyUserInfo {
    public List<UserInfoModel> selectAll();

}
