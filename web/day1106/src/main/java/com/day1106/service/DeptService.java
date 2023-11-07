package com.day1106.service;

import com.day1106.mapper.DeptMapper;
import com.day1106.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Package-name: com.day1106.service
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 06-11-2023  17:37
 * Describe：
 */


@Component
public class DeptService implements DeptMapper {
    @Autowired
    private DeptMapper deptMapper;


    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Dept record) {
        return 0;
    }

    @Override
    public int insertSelective(Dept record) {
        return 0;
    }

    @Override
    public Dept selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Dept record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Dept record) {
        return 0;
    }

    @Override
    public List<Dept> selectDeptNo() {
        return deptMapper.selectDeptNo();
    }
}
