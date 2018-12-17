package com.afan.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName: Dept
 * @Description: 部门实体类
 * @Author：Administrator
 * @Date : 2018/12/12 9:34
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable{

    public Long deptno;
    public String dname;
    public String db_source;


}
