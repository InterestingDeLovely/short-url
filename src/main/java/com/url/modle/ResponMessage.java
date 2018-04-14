package com.url.modle;

/**
 * 返回前段数据实体
 * @author YI
 * @date 2018-4-14 14:40:04
 */
public class ResponMessage {
    private int code;
    private String data;
    private String meaage;

    public ResponMessage() {
        super();
    }

    public ResponMessage(int code, String data, String meaage) {
        this.code = code;
        this.data = data;
        this.meaage = meaage;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMeaage() {
        return meaage;
    }

    public void setMeaage(String meaage) {
        this.meaage = meaage;
    }

    @Override
    public String toString() {
        return "ResponMessage{" +
                "code=" + code +
                ", data='" + data + '\'' +
                ", meaage='" + meaage + '\'' +
                '}';
    }
}
