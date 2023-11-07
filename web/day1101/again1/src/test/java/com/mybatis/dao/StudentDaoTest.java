package com.mybatis.dao;

import com.mybatis.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Package-name: com.mybatis.dao
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 01-11-2023  16:20
 * Describe：
 */

public class StudentDaoTest {

    StudentDao dao;

    @Before
    public void setUp() throws Exception {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = builder.build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = build.openSession();
        dao = sqlSession.getMapper(StudentDao.class);
    }

    @Test
    public void selectAll() {
        List<Student> students = dao.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void selectuser1() {
        Student student = dao.selectuser1();
        System.out.println(student);
    }
}