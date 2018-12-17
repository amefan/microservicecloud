package com.afan.springcloud.service.impl;

import com.afan.springcloud.dao.DeptDao;
import com.afan.springcloud.entity.Dept;
import com.afan.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: DeptServiceImpl
 * @Description: TODO
 * @Author：Administrator
 * @Date : 2018/12/12 15:06
 */

@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao deptDao;
    @Override

    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }
}
