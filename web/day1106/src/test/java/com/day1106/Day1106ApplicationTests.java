package com.day1106;

import com.day1106.model.Dept;
import com.day1106.service.DeptService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
class Day1106ApplicationTests {

    @Resource
    private DeptService deptService;

    @Test
    public void selectDeptNo() {


        List<Dept> depts = deptService.selectDeptNo();
        System.out.println(depts.toArray());


    }
}
