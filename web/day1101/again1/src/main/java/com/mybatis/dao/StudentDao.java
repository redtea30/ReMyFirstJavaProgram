package com.mybatis.dao;

import com.mybatis.model.Student;

import java.util.List;

/**
 * Package-name: com.mybatis.dao
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 01-11-2023  16:03
 * Describe：
 */

public interface StudentDao {
    public List<Student> selectAll();

    public Student selectuser1();

}
