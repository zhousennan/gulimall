package com.zsn.gulimall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsn.gulimall.product.entity.SpuInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * spu信息; InnoDB free: 8192 kB
 * 
 * @author zsn
 * @email 1765509297@qq.com
 * @date 2022-02-22 10:59:26
 */
@Mapper
public interface SpuInfoDao extends BaseMapper<SpuInfoEntity> {

    void updateSpuState(@Param("spuId") Long spuId, @Param("code") int code);
}
