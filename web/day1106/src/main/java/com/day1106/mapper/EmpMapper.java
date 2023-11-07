package com.day1106.mapper;

import com.day1106.model.Emp;
import org.apache.ibatis.annotations.Mapper;

/**
* @author jksps
* @description 针对表【emp】的数据库操作Mapper
* @createDate 2023-11-06 16:22:14
* @Entity com.day1106.model.Emp
*/

@Mapper
public interface EmpMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

}
