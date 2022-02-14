package com.mybatis.plus.dynamic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.mybatis.plus.dynamic.mapper")
public class MybatisPlusDynamicDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusDynamicDemoApplication.class, args);
    }
}
