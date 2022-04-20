package com.zsn.gulimall.member;

import com.zsn.gulimall.member.feign.CouponFeignService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zsn
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(clients = CouponFeignService.class)
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
