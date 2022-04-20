package com.zsn.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.zsn.gulimall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GuilimailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuilimailProductApplication.class, args);
    }

}
