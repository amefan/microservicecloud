package com.afan.springcloud.controller;

import com.afan.springcloud.entity.Dept;
import com.afan.springcloud.serivce.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

    //private static final String REST_URL_PERFIX = "http://MICROSERVICECLOUD-DEPT";
    //在集群中通过服务名去找服务的提供者

    @Autowired
    private DeptClientService deptClientService;

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") long id){
       return deptClientService.get(id);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list(){
        return deptClientService.list();
    }
    @GetMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        System.out.println(dept);
        return deptClientService.add(dept);
    }

}
