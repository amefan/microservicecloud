package com.afan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: SpringApplicationConsumer80
 * @Description: TODO
 * @Author：Administrator
 * @Date : 2018/12/13 13:23
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ComponentScan("com.afan.springcloud")
public class SpringApplicationConsumerFeign80 {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationConsumerFeign80.class,args);
    }
}
