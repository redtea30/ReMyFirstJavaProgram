package com.kfm.mybatis.dao.impl;

import com.kfm.mybatis.model.UserInfoModel;
import org.junit.Test;

import java.util.List;

/**
 * Package-name: com.kfm.mybatis.dao.impl
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 01-11-2023  11:38
 * Describe：
 */

public class UserMapperImplTest {

    @Test
    public void selectAll() {
        UserMapperImpl userMapper = new UserMapperImpl();
        List<UserInfoModel> userInfoModels = userMapper.selectAll();
        for (UserInfoModel userInfoModel : userInfoModels) {
            System.out.println(userInfoModel);
        }


    }
}