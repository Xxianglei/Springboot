package com.xianglei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@MapperScan("com.xianglei.mapper")
@ComponentScan("com.xianglei")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}


