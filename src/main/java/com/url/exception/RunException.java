package com.url.exception;

/**
 * 运行时异常，用于数据库事务回滚
 * @author YI
 * @date 2018-4-12 15:20:56
 */
public class RunException extends RuntimeException {
    private int code;
    private String msg;
    private Exception e;

    public RunException(int code, String msg, Exception e) {
        this.code = code;
        this.msg = msg;
        this.e = e;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Exception getE() {
        return e;
    }

    public void setE(Exception e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "RunException{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", e=" + e +
                '}';
    }
}
