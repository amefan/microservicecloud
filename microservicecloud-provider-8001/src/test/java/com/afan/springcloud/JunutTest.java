package com.afan.springcloud;/**
 * Created by Administrator on 2018/12/12.
 */

import com.afan.springcloud.dao.DeptDao;
import com.afan.springcloud.entity.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName: JunutTest
 * @Description: TODO
 * @Author：Administrator
 * @Date : 2018/12/12 14:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JunutTest {

      @Autowired
      private DeptDao deptDao;

      @Test
      public void testDept(){
          Dept d = deptDao.findById(1L);
          System.out.println(d);
      }
}
