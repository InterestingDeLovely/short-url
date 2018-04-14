package com.url.modle;

import java.util.Date;

/**
 * 用户数据
 * @author YI
 * @data 2018-4-14 12:30:57
 */
public class User {
    private int id;
    /**
     * 性别
     */
    private String userSex;
    /**
     * 0：冻结、1：正常使用
     */
    private String userStatus;
    /**
     * 1：普通会员、2：高级会员、3：超级会员
     */
    private String userGrade;
    /**
     * 邮箱地址
     */
    private String userEmail;
    /**
     * 用户头像
     */
    private String userHeadPortrait;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户最后登录时间
     */
    private Date userEndTime;
    /**
     * 用户创建时间
     */
    private Date crtTime;

    public User() {
        super();
    }

    public User(int id, String userSex, String userStatus, String userGrade, String userEmail, String userHeadPortrait, String userName, Date userEndTime, Date crtTime) {
        this.id = id;
        this.userSex = userSex;
        this.userStatus = userStatus;
        this.userGrade = userGrade;
        this.userEmail = userEmail;
        this.userHeadPortrait = userHeadPortrait;
        this.userName = userName;
        this.userEndTime = userEndTime;
        this.crtTime = crtTime;
    }

    public User(String userSex, String userStatus, String userGrade, String userEmail, String userHeadPortrait, String userName, Date userEndTime, Date crtTime) {
        this.userSex = userSex;
        this.userStatus = userStatus;
        this.userGrade = userGrade;
        this.userEmail = userEmail;
        this.userHeadPortrait = userHeadPortrait;
        this.userName = userName;
        this.userEndTime = userEndTime;
        this.crtTime = crtTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(String userGrade) {
        this.userGrade = userGrade;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserHeadPortrait() {
        return userHeadPortrait;
    }

    public void setUserHeadPortrait(String userHeadPortrait) {
        this.userHeadPortrait = userHeadPortrait;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getUserEndTime() {
        return userEndTime;
    }

    public void setUserEndTime(Date userEndTime) {
        this.userEndTime = userEndTime;
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userSex='" + userSex + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", userGrade='" + userGrade + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userHeadPortrait='" + userHeadPortrait + '\'' +
                ", userName='" + userName + '\'' +
                ", userEndTime=" + userEndTime +
                ", crtTime=" + crtTime +
                '}';
    }
}
