package com.zsn.gulimall.order.dao;

import com.zsn.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单; InnoDB free: 7168 kB
 * 
 * @author zsn
 * @email 1765509297@qq.com
 * @date 2022-02-24 15:55:04
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
