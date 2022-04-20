package com.zsn.gulimall.product.vo;

import lombok.Data;

/**
 * @author yaoxinjia
 */
@Data
public class AttrRespVo extends AttrVo{

    private String catelogName;
    private String groupName;

    private Long[] catelogPath;
}
