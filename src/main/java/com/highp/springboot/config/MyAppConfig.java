package com.highp.springboot.config;

import com.highp.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration:指明当前类是一个配置类；就是来替代之前的spring配置文件
 *
 */
@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService(){
        System.out.println("配置类@bean给容器添加组件了。。。");
        return new HelloService();
    }
}
