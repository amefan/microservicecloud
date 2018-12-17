package com.afan.springcloud.dao;

import com.afan.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: DeptDao
 * @Description: TODO
 * @Author：Administrator
 * @Date : 2018/12/12 13:43
 */
@Mapper
@Repository
public interface DeptDao {

     boolean addDept(Dept dept);

     List<Dept> findAll();

     Dept findById(Long id);

}
