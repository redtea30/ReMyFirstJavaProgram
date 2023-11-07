package com.kfm.mybatis.dao.impl;


import com.kfm.mybatis.UserInfoDao;
import com.kfm.mybatis.model.UserInfoModel;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;



/**
 * Package-name: com.kfm.mybatis.dao
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 01-11-2023  11:05
 * Describe：
 */

public class UserMapperImpl implements UserInfoDao {
    @Override
    public List<UserInfoModel> selectAll() {
        String resource = "mybatis-config.xml";
        try {
            // 读取配置文件
            InputStream in = Resources.getResourceAsStream(resource);
            // 创建 SqlSessionFactory 的构建者对象
            SqlSessionFactoryBuilder builder = new
                    SqlSessionFactoryBuilder();
            // 使用构建者创建工厂对象 SqlSessionFactory对象
            SqlSessionFactory factory = builder.build(in);
            // 使用 SqlSessionFactory 生产 SqlSession 对象
            SqlSession sqlSession = factory.openSession();
            // 使用 SqlSession 对象执行操作
            // 参数：要执行sql的唯一标识符，namespace+id
            List<UserInfoModel> userInfoDao =
                    sqlSession.selectList("com.mybatis.dao.MyUSerInfo.selectAll");
            return userInfoDao;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


    }





}
