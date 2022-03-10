package com.zsn.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.common.utils.PageUtils;
import com.zsn.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格; InnoDB free: 7168 kB
 *
 * @author zsn
 * @email 1765509297@qq.com
 * @date 2022-02-25 09:32:06
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

