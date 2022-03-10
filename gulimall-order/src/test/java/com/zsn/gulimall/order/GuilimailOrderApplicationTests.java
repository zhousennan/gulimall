package com.zsn.gulimall.order;


import com.zsn.gulimall.order.entity.OrderItemEntity;
import com.zsn.gulimall.order.service.OrderItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class GuilimailOrderApplicationTests {


    @Autowired
   private OrderItemService orderItemService;
    @Test
    void contextLoads() {
        OrderItemEntity orderItemEntity = new OrderItemEntity();
        orderItemEntity.setCategoryId(1l);
        orderItemService.save(orderItemEntity);
        System.out.println("save success");
    }

}
