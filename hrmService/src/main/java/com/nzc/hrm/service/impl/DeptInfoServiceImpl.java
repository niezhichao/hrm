package com.nzc.hrm.service.impl;

import com.nzc.hrm.dao.DeptDao;
import com.nzc.hrm.entity.po.DeptInfo;
import com.nzc.hrm.entity.vo.DeptInfoVo;
import com.nzc.hrm.service.DeptInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DeptInfoServiceImpl implements DeptInfoService {

    @Autowired
    DeptDao deptDao;

    public int insert(DeptInfo record) {
        return 0;
    }

    public int deleteById(Integer integer) {
        return 0;
    }

    public int deleteByExample(DeptInfoVo example) {
        return 0;
    }

    public List<DeptInfo> getListByExample(DeptInfoVo example) {
        return null;
    }

    public DeptInfo getElementById(Integer integer) {
        return deptDao.getElementById(integer);
    }

    public List<DeptInfo> getListByMap(Map param) {
        return null;
    }
}
