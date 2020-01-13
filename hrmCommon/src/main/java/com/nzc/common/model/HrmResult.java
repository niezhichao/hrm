package com.nzc.common.model;

import java.io.Serializable;

/**
 * class for response result
 * @author niezhichao 2019/12/11
 */
public class HrmResult  implements Serializable{
    private String msg;
    private String code;
    private Object data;


    public HrmResult(ResultCode resultCode){

        this.msg=resultCode.getMsg();
        this.code=resultCode.getCode();
    }

    public HrmResult(Object data){
        this.data=data;
    }

    public HrmResult(ResultCode resultCode,Object data){
        this(resultCode);
        this.data=data;
    }

    public static HrmResult ok(){
        return new HrmResult(ResultCode.SUCCESS);
    }

    public static HrmResult error(){
        return new HrmResult(ResultCode.ERROR);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
