package com.zsn.gulimall.member;

import com.zsn.gulimall.member.entity.GrowthChangeHistoryEntity;
import com.zsn.gulimall.member.service.GrowthChangeHistoryService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallMemberApplicationTests {

    @Autowired
    private GrowthChangeHistoryService growthChangeHistoryService;

    @Test
    void contextLoads() {
        GrowthChangeHistoryEntity growthChangeHistoryEntity = new GrowthChangeHistoryEntity();
        growthChangeHistoryEntity.setChangeCount(1);
        growthChangeHistoryService.save(growthChangeHistoryEntity);
        System.out.println("save success");

    }

}
