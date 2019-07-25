package com.aaa.emp.service;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface EmpService {

    /**
     * 获取列表
     * @return
     */
    List<Map> getEmpList();

    /**
     * 获取单个成员
     * @param id
     * @return
     */
    Map getEmpById(Integer id);
}
