package com.kfm.mybatis;

import com.kfm.mybatis.model.UserInfoModel;

import java.util.List;

/**
 * Package-name: com.kfm.mybatis.dao
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 01-11-2023  11:03
 * Describe：
 */

public interface UserInfoDao {
    List<UserInfoModel> selectAll();
}
