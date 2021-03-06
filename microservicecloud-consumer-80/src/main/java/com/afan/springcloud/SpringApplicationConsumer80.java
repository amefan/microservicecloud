package com.afan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: SpringApplicationConsumer80
 * @Description: TODO
 * @Author：Administrator
 * @Date : 2018/12/13 13:23
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringApplicationConsumer80 {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationConsumer80.class,args);
    }
}
