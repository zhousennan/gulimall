package com.zsn.gulimall.member.dao;

import com.zsn.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录; InnoDB free: 7168 kB
 * 
 * @author zsn
 * @email 1765509297@qq.com
 * @date 2022-02-24 16:41:27
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
