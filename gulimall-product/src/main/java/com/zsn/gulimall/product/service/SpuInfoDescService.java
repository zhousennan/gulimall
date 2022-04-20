package com.zsn.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.common.utils.PageUtils;
import com.zsn.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍; InnoDB free: 8192 kB
 *
 * @author zsn
 * @email 1765509297@qq.com
 * @date 2022-02-22 10:59:25
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void savsSpuInfoDesc(SpuInfoDescEntity descEntity);
}

