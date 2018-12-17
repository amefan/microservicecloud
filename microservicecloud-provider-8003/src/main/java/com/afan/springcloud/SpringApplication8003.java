package com.afan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: SpringBootApplication
 * @Description: TODO
 * @Author：Administrator
 * @Date : 2018/12/12 14:25
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringApplication8003 {
        public static void main(String[] args) {
            SpringApplication.run(SpringApplication8003.class,args);

    }

}
