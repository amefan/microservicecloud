package com.afan.springcloud.controller;

import com.afan.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName: DeptController_Consumer
 * @Description: TODO
 * @Author：Administrator
 * @Date : 2018/12/13 11:42
 */
@RestController
public class DeptController_Consumer {

    private static final String REST_URL_PERFIX = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") long id){
       return restTemplate.getForObject(REST_URL_PERFIX+"/dept/get/"+id,Dept.class);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PERFIX+"/dept/list",List.class);
    }
    @GetMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        System.out.println(dept);
        return restTemplate.postForObject(REST_URL_PERFIX+"/dept/add",dept,boolean.class);
    }
}
