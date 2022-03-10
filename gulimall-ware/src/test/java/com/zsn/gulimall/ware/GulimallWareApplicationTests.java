package com.zsn.gulimall.ware;

import com.zsn.gulimall.ware.entity.PurchaseEntity;
import com.zsn.gulimall.ware.service.PurchaseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallWareApplicationTests {

    @Autowired
    private PurchaseService purchaseService;
    @Test
    void contextLoads() {
        PurchaseEntity purchaseEntity = new PurchaseEntity();
        purchaseEntity.setAssigneeId(1l);
        purchaseService.save(purchaseEntity);
        System.out.println("save success");
    }

}
