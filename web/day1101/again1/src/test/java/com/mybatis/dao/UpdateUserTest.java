package com.mybatis.dao;

import com.mybatis.model.UserInfoModel;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Package-name: com.mybatis.dao
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 01-11-2023  17:54
 * Describe：
 */

public class UpdateUserTest {
    UpdateUser table;
    InputStream in;

    @Before
    public void setUp() throws Exception {
        in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = builder.build(in);
        SqlSession sqlSession = build.openSession(true);
        table = sqlSession.getMapper(UpdateUser.class);
    }

    @After
    public void tearDown() throws Exception {
        in.close();
    }

    @Test
    public void deleteOneUser() {
        int i = table.deleteOneUser("user189");
        if (i > 0) {
            System.out.println(true);
        }
    }


    @Test
    public void selectOneUser() {
        UserInfoModel user1 = table.selectOneUser("user1", "123");
        System.out.println(user1);

    }

    @Test
    public void selectOneUser1() {
        UserInfoModel user1 = table.selectOneUser("user1", "123");
        System.out.println(user1);
    }

    @Test
    public void insertOneuser() {
        int i = table.insertOneuser("userTest1", "1234", "qweqweq@qq.com");
        if (i > 1) {
            System.out.println(true);
        }

    }

    @Test
    public void selectTest() {
        List<UserInfoModel> list = table.selectTest();
        for (UserInfoModel model : list) {
            System.out.println(model);
        }
    }
}