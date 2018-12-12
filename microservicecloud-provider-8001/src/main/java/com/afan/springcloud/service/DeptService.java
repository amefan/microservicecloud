package com.afan.springcloud.service;

import com.afan.springcloud.entity.Dept;

import java.util.List;

/**
 * Created by Administrator on 2018/12/12.
 */
public interface DeptService {

    boolean add(Dept dept);

    List<Dept> list();

    Dept get(Long id);
}
