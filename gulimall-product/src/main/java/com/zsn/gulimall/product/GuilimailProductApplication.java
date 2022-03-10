package com.zsn.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zsn.gulimall.product.dao")
@SpringBootApplication
public class GuilimailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuilimailProductApplication.class, args);
    }

}
