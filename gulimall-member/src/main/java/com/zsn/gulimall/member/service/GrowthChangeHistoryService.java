package com.zsn.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.common.utils.PageUtils;
import com.zsn.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录; InnoDB free: 7168 kB
 *
 * @author zsn
 * @email 1765509297@qq.com
 * @date 2022-02-24 16:41:27
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

