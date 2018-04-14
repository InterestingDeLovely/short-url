package com.url.modle;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private String userName;
    private String passWord;
    private String email;
    private String nickName;
    private String regTime;

    public User() {
        super();
    }
    public User(String email, String nickName, String passWord, String userName, String regTime) {
        super();
        this.email = email;
        this.nickName = nickName;
        this.passWord = passWord;
        this.userName = userName;
        this.regTime = regTime;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getRegTime() {
        return regTime;
    }
    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }
}
