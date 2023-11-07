package com.mybatis.controller;

import com.mybatis.dao.UserMapper;
import com.mybatis.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Package-name: com.mybatis.controller
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 02-11-2023  23:45
 * Describe：
 */

@RestController
public class SelectTestController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getUserByName")
    public UserModel getUserByName(@RequestParam String name, HttpServletRequest req, HttpServletResponse resp) {
/*        UserModel user1 = userMapper.selectOnce("user1");
        try {
            resp.getWriter().write(user1.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        return userMapper.selectOnce("user1");

    }
}
