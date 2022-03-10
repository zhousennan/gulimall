package com.zsn.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.common.utils.PageUtils;
import com.zsn.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息; InnoDB free: 7168 kB
 *
 * @author zsn
 * @email 1765509297@qq.com
 * @date 2022-02-24 17:34:19
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

