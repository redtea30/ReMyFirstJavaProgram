package com.day1106.controller;

import com.day1106.model.Dept;
import com.day1106.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Package-name: com.day1106.controller
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 06-11-2023  17:43
 * Describe：
 */

@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService service;

    @RequestMapping("/list")
    @ResponseBody
    public List<Dept> selectDeptNo() {
        return service.selectDeptNo();
    }

}
