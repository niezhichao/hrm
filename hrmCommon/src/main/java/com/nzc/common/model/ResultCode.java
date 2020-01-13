package com.nzc.common.model;

public enum ResultCode {

    SUCCESS("RES001","成功"),
    ERROR("RES000","系统异常！");
    private String code;
    private String msg;
    private ResultCode(String code,String msg){
        this.code=code;
        this.msg=msg;
    }
    public String getCode(){
        return this.code;
    }

    public  String getMsg(){
        return this.msg;
    }
}
