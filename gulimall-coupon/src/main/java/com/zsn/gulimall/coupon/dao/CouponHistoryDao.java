package com.zsn.gulimall.coupon.dao;

import com.zsn.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录; InnoDB free: 7168 kB
 * 
 * @author zsn
 * @email 1765509297@qq.com
 * @date 2022-02-25 09:32:06
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
