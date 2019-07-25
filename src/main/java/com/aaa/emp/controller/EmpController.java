package com.aaa.emp.controller;

import com.aaa.emp.service.EmpService;
import com.aaa.emp.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

    @Autowired
    private DeptService deptService;

    @RequestMapping("/empList")
    public Object getEmpList(){
        System.out.println(111);
        System.out.println(222);
        return empService.getEmpList();
    }

    /**
     * 根据id获取对象
     * @param empNo
     * @return
     */
    @RequestMapping("/empById")
    public Object getEmpById(Integer empNo){
        Map empInfo = empService.getEmpById(empNo);
        empInfo.put("deptList",deptService.getDeptList());
        return empInfo;
    }
}
