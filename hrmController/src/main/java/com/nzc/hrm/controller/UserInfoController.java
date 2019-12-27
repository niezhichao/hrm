package com.nzc.hrm.controller;

import com.nzc.common.model.HrmResult;
import com.nzc.hrm.api.UserInfoApi;
import com.nzc.hrm.entity.po.UserInfo;
import com.nzc.hrm.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/userInfo")
public class UserInfoController implements UserInfoApi {

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("/insert")
    @ResponseBody
    @Override
    public HrmResult insertUserIfo(UserInfo userInfo) {
        userInfoService.insert(userInfo);
        return HrmResult.ok();
    }
}
