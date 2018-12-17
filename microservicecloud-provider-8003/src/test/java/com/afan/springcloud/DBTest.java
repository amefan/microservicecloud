package com.afan.springcloud;

import com.afan.springcloud.dao.DeptDao;
import com.afan.springcloud.entity.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName: DBTest
 * @Description: TODO
 * @Author：Administrator
 * @Date : 2018/12/17 15:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DBTest {

    @Autowired
    private DeptDao deptDao;

    @Test
    public void testDept(){
        Dept d = deptDao.findById(1L);
        System.out.println(d);
    }

}
