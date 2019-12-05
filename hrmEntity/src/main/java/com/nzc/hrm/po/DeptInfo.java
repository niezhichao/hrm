package com.nzc.hrm.po;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "dept_inf")
public class DeptInfo implements Serializable {

    @Id
    @Column(name="ID")
    private int id;
    @Column(name="NAME")
    private String name;
    @Column(name="ID")
    private String remark;

    public DeptInfo(){

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
