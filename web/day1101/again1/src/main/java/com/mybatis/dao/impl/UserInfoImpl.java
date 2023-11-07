package com.mybatis.dao.impl;

import com.mybatis.dao.MyUserInfo;
import com.mybatis.model.UserInfoModel;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Package-name: com.mybatis.dao.impl
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 01-11-2023  11:52
 * Describe：
 */

public class UserInfoImpl implements MyUserInfo {
    @Override
    public List<UserInfoModel> selectAll() {
        try {
            // 加载文件
            InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
            //  创建sqlSessionFactory构建者对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //  创建sqlSessionFactory
            SqlSessionFactory build = builder.build(stream);
            //  创建sqlSession对象
            SqlSession sqlSession = build.openSession();
            //  通过sqlSession执行sql
            List<UserInfoModel> list = sqlSession.selectList("com.mybatis.dao.MyUserInfo.selectAll");
            return list;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
