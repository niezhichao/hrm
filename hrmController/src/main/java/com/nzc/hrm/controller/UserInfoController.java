package com.nzc.hrm.controller;

import com.nzc.common.model.HrmResult;
import com.nzc.hrm.api.UserInfoApi;
import com.nzc.hrm.entity.po.UserInfo;
import com.nzc.hrm.service.UserInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/userInfo")
public class UserInfoController implements UserInfoApi {

    private static final Logger log=LogManager.getLogger(UserInfoController.class);

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("/insert")
    @ResponseBody
    @Override
    public HrmResult insertUserInfo(@RequestBody  UserInfo userInfo) {
        try {
            userInfoService.insert(userInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
        return HrmResult.ok();
    }




}
