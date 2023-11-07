package com.mybatis.dao.impl;


import com.mybatis.model.UserInfoModel;
import org.junit.Test;

import java.util.List;

/**
 * Package-name: com.mybatis.dao.impl
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 01-11-2023  12:11
 * Describe：
 */

public class UserInfoImplTest {

    @Test
    public void selectAll() {
        UserInfoImpl userInfo = new UserInfoImpl();
        List<UserInfoModel> userInfoModels = userInfo.selectAll();
        for (UserInfoModel userInfoModel : userInfoModels) {
            System.out.println(userInfoModel);
        }



    }
}