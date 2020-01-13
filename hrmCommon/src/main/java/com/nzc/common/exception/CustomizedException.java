package com.nzc.common.exception;

import com.nzc.common.model.ResultCode;

public class CustomizedException extends RuntimeException{
    private ResultCode resultCode;
    public CustomizedException(ResultCode resultCode){
        super(resultCode.getMsg());
        this.resultCode=resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

    public void setResultCode(ResultCode resultCode) {
        this.resultCode = resultCode;
    }
}
