package com.zsn.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.common.utils.PageUtils;
import com.zsn.gulimall.product.entity.AttrAttrgroupRelationEntity;
import com.zsn.gulimall.product.vo.AttrGroupRelatinVo;

import java.util.List;
import java.util.Map;

/**
 * 属性&属性分组关联; InnoDB free: 8192 kB
 *
 * @author zsn
 * @email 1765509297@qq.com
 * @date 2022-02-22 10:59:25
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);


    void saveBatch(List<AttrGroupRelatinVo> vos);
}

