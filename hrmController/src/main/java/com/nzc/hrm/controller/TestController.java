package com.nzc.hrm.controller;

import com.nzc.hrm.dao.DeptDao;
import com.nzc.hrm.entity.po.DeptInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
   /* @Autowired
    private DeptDao deptDao;

    @RequestMapping(value = "/test")
    @ResponseBody
    public DeptInfo test(){
        return  deptDao.getElementById(1);
    }*/
}
