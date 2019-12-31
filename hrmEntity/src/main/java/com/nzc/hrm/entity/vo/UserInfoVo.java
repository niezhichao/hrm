package com.nzc.hrm.entity.vo;


import java.io.Serializable;
import java.util.Date;

public class UserInfoVo implements Serializable {

    private int id;
    private String username;//用户名
    private String loginName;//登录名
    private int status;
    private String  createDate;

    public UserInfoVo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}

