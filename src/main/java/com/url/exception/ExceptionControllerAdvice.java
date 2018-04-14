package com.url.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常
 * @author YI
 * @date 2018-4-12 15:19:27
 */
@ControllerAdvice
public class ExceptionControllerAdvice {
    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map errorHandler(Exception ex) {
        Map map = new HashMap(16);
        map.put("code", 500);
        map.put("msg", ex.getMessage());
        map.put("exception", ex.toString());

        ex.printStackTrace();

        return map;
    }

    /**
     * 拦截捕捉自定义异常 ErrorHandler.class
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = RunException.class)
    public Map ErrorHandler(RunException ex) {
        Map map = new HashMap(16);
        map.put("code", ex.getCode());
        map.put("msg", ex.getMsg());
        map.put("exception", ex.getE().toString());

        ex.getE().printStackTrace();

        return map;
    }
}
