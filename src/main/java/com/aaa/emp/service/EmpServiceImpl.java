package com.aaa.emp.service;

import com.aaa.emp.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;

    /**
     * 获取列表
     * @return
     */
    @Override
    public List<Map> getEmpList() {
        return empDao.getEmpList();
    }

    /**
     * 获取单个成员
     * @param id
     * @return
     */
    @Override
    public Map getEmpById(Integer id) {
        return empDao.getEmpById(id);
    }
}
