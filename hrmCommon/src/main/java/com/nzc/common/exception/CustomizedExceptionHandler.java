package com.nzc.common.exception;

import com.nzc.common.model.HrmResult;
import com.nzc.common.model.ResultCode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class CustomizedExceptionHandler {

    private static final Logger log=LogManager.getLogger(CustomizedExceptionHandler.class);

    @ExceptionHandler(CustomizedException.class)
    @ResponseBody
    public HrmResult customizedException(CustomizedException ex){
        ex.printStackTrace();
        log.error("自定义异常："+ex.getMessage());
        ResultCode resultCode=ex.getResultCode();
        return new HrmResult(resultCode);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public HrmResult commonException(Exception ex){
        ex.printStackTrace();
        return new HrmResult(ResultCode.ERROR,ex.getMessage());
    }
}
