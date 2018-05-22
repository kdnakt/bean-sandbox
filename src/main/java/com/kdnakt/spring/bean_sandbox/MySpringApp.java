package com.kdnakt.spring.bean_sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
public class MySpringApp {

    public static void main(String[] args) {
        SpringApplication.run(MySpringApp.class, args);
    }

    @Bean
    public MyBeanInstantiatedByConfig myBeanInstantiatedByConfig() {
        return new MyBeanInstantiatedByConfig();
    }
}
