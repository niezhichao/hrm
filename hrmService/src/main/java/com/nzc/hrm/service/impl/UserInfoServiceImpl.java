package com.nzc.hrm.service.impl;

import com.nzc.hrm.dao.UserInfoDao;
import com.nzc.hrm.entity.po.UserInfo;
import com.nzc.hrm.entity.vo.UserInfoVo;
import com.nzc.hrm.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoDao userInfoDao;

    public int insert(UserInfo record) {
        return userInfoDao.insert(record);
    }

    public int deleteById(Integer integer) {
        return 0;
    }

    public int deleteByExample(UserInfoVo example) {
        return 0;
    }

    public int update(UserInfo record) {
        return 0;
    }

    public List<UserInfo> getListByExample(UserInfoVo example) {
        return null;
    }

    public UserInfo getElementById(Integer integer) {
        return null;
    }

    public List<UserInfo> getListByMap(Map param) {
        return null;
    }
}
