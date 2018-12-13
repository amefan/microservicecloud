package com.afan.springcloud.cfgBean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ConfigBean
 * @Description: TODO
 * @Author：Administrator
 * @Date : 2018/12/13 11:33
 */
@Configuration
public class ConfigBean {

       @Bean
       public RestTemplate getRestTemplate(){

           return new RestTemplate();
       }
}
/**
 * 此类相当于在以前的spring配置文件applicationContext.xml
 * 中配置了
 * <bean id="RestTemplate" class="org.springframework.web.client.RestTemplate"></bean>
 */

