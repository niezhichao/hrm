package com.nzc.hrm.entity.vo;


import java.io.Serializable;

public class DeptInfoVo implements Serializable {


    private int id;
    private String name;
    private String remark;

    public DeptInfoVo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
