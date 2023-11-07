package com.mybatis.dao;

import com.day1106.model.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.InputStream;

/**
 * Package-name: com.mybatis.dao
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 02-11-2023  23:16
 * Describe：
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    InputStream in;
    UserMapper mapper;

    @Autowired
    private Emp emp1;

    @Test
    public void testAddUser() {


    }
}