package com.aaa.emp.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Repository
public interface EmpDao {
    /**
     * 获取列表
     * @return
     */
    @Select("select * from emp")
    List<Map> getEmpList();

    /**
     * 获取单个成员
     * @param id
     * @return
     */
    @Select("select * from emp where empno=#{empNo}")
    Map getEmpById(Integer id);
}
