package com.zsn.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.common.utils.PageUtils;
import com.zsn.gulimall.product.entity.CategoryEntity;
import com.zsn.gulimall.product.vo.Catelog2Vo;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类; InnoDB free: 8192 kB
 *
 * @author zsn
 * @email 1765509297@qq.com
 * @date 2022-02-22 10:59:25
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 查出所有分类以及子分类，以树形结构组装起来
     * @return
     */
    List<CategoryEntity> listWithTree();


    /**
     * 删除
     * @param asList
     */
    void removeMenuByIds(List<Long> asList);

    /**
     * 找到catelogId的完整路径：
     * [父/子/孙]
     * @param catelogId
     * @return
     */
    Long[] findCatelogPath(Long catelogId);

    /**
     * 修改
     * @param category
     * @return
     */
    void updateCasecade(CategoryEntity category);


    List<CategoryEntity> getLevel1Categorys();

    Map<String, List<Catelog2Vo>> getCatalogJson();

}

