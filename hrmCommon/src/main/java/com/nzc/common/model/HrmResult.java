package com.nzc.common.model;

import java.io.Serializable;

/**
 * class for response result
 * @author niezhichao 2019/12/11
 */
public class HrmResult  {
    private String msg;
    private int status;
    private Object data;

    public HrmResult(String msg,int status){
        this.msg=msg;
        this.status=status;
    }

    public HrmResult(String msg,Object data){
        this.msg=msg;
        this.data=data;
        this.status=200;
    }

    public HrmResult(Object data){
        this.data=data;
        this.status=200;
    }

    public static HrmResult ok(){
        return new HrmResult("Program execute normally",200);
    }

    public static HrmResult  success(String msg,Object data){
        return new HrmResult(msg,data);
    }
    public static HrmResult success(Object data){
        return new HrmResult(data);
    }

    public static HrmResult error(String msg,int status){
        return new HrmResult(msg,status);
    }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
