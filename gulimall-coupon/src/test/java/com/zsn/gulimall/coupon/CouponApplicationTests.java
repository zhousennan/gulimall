package com.zsn.gulimall.coupon;

import com.zsn.gulimall.coupon.entity.CouponHistoryEntity;
import com.zsn.gulimall.coupon.service.CouponHistoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CouponApplicationTests {

    @Autowired
    CouponHistoryService couponHistoryService;

    @Test
    void contextLoads() {
        CouponHistoryEntity couponHistoryEntity = new CouponHistoryEntity();
        couponHistoryEntity.setCouponId(1L);
        System.out.println("success");
        couponHistoryService.save(couponHistoryEntity);
    }

}
