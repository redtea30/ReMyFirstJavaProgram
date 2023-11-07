package com.mybatis.dao;

import com.mybatis.model.UserModel;

/**
 * Package-name: com.mybatis
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 02-11-2023  22:27
 * Describe：
 */


public interface UserMapper {
    public UserModel selectOnce(String username);

}
