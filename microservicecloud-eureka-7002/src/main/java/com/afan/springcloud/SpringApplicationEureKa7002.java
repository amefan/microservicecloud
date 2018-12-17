package com.afan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: SpringApplicationEureKa7001
 * @Description: TODO
 * @Author：Administrator
 * @Date : 2018/12/13 15:19
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringApplicationEureKa7002 {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationEureKa7002.class,args);
    }
}
