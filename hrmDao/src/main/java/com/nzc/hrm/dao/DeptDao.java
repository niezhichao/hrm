package com.nzc.hrm.dao;

import com.nzc.common.base.BaseDao;
import com.nzc.hrm.entity.po.DeptInfo;
import com.nzc.hrm.entity.vo.DeptInfoVo;
import org.springframework.stereotype.Component;

@Component
public interface DeptDao extends BaseDao<DeptInfo,Integer,DeptInfoVo>{

}
