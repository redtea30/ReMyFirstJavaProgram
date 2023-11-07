package com.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Package-name: com.mybatis.model
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 01-11-2023  16:04
 * Describe：
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    private String username;
    private String password;
    private String email;
}
