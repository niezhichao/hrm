package com.nzc.hrm.dao;

import com.nzc.common.base.BaseDao;
import com.nzc.hrm.entity.po.UserInfo;
import com.nzc.hrm.entity.vo.UserInfoVo;
import org.springframework.stereotype.Component;

@Component
public interface UserInfoDao extends BaseDao<UserInfo,Integer,UserInfoVo> {
}
