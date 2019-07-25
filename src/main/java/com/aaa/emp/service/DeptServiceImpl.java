package com.aaa.emp.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private RestTemplate restTemplate;

    //getDeptError与下面的方法提示消息名相同
    //并且返回值类型要与调用获取列表方法的相同
    @HystrixCommand(fallbackMethod ="getDeptError")
    @Override
    public List<Map> getDeptList() {
        List<Map> deptList = restTemplate.getForObject("http://deptmgr/deptList", List.class);
        return deptList;
    }

    /**
     * 错误方法，调用错误方法要和原方法返回值相同
     * @return
     */
    private List<Map> getDeptError(){
        Map map=new HashMap<>();
        List maps = new ArrayList<>();
        map.put("error","获取部门信息错误");
        maps.add(map);
        return maps;
    }
}
