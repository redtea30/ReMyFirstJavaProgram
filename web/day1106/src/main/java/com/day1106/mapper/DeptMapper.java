package com.day1106.mapper;

import com.day1106.model.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author jksps
* @description 针对表【dept】的数据库操作Mapper
* @createDate 2023-11-06 16:21:14
* @Entity com.day1106.model.Dept
*/

@Mapper
public interface DeptMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    public List<Dept> selectDeptNo();

}
