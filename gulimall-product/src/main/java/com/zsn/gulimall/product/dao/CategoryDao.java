package com.zsn.gulimall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsn.gulimall.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类; InnoDB free: 8192 kB
 * 
 * @author zsn
 * @email 1765509297@qq.com
 * @date 2022-02-22 10:59:25
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
