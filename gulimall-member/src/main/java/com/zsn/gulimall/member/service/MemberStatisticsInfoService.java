package com.zsn.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.common.utils.PageUtils;
import com.zsn.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息; InnoDB free: 7168 kB
 *
 * @author zsn
 * @email 1765509297@qq.com
 * @date 2022-02-24 16:41:27
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

