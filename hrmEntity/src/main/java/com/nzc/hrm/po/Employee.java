package com.nzc.hrm.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name ="job_inf")
public class Employee implements Serializable {
    @Id
    private int id;
    @Column(name = "DEPT_ID")
    private  int  deptId;
    @Column(name = "JOB_ID")
    private int  jobId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CARD_ID")
    private String IDCard;//身份证
    @Column(name = "ADDRESS")
    private String addr;
    @Column(name = "TEL")
    private String tel;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "SEX")
    private int sex;

    public Employee(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
