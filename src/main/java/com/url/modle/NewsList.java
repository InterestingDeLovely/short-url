package com.url.modle;

import java.util.Date;

public class NewsList {
    /**
     * id
     */
    private int id;
    /**
     * 短链接
     */
    private String shortName;
    /**
     * 长连接链接
     */
    private String longName;
    /**
     * 链接作用
     */
    private String desc;
    /**
     * 短链接生成者
     */
    private String shortAuthor;
    /**
     * 审核结果
     */
    private String shortStatus;
    /**
     * 是否开放浏览
     */
    private String shortLook;
    /**
     * 是否浏览
     */
    private String isShow;
    /**
     * 创建时间
     */
    private Date newsTime;

    public NewsList(int id, String shortName, String longName, String desc, String shortAuthor, String shortStatus, String shortLook, String isShow, Date newsTime) {
        this.id = id;
        this.shortName = shortName;
        this.longName = longName;
        this.desc = desc;
        this.shortAuthor = shortAuthor;
        this.shortStatus = shortStatus;
        this.shortLook = shortLook;
        this.isShow = isShow;
        this.newsTime = newsTime;
    }

    public NewsList(String shortName, String longName, String desc, String shortAuthor, String shortStatus, String shortLook, String isShow, Date newsTime) {
        this.shortName = shortName;
        this.longName = longName;
        this.desc = desc;
        this.shortAuthor = shortAuthor;
        this.shortStatus = shortStatus;
        this.shortLook = shortLook;
        this.isShow = isShow;
        this.newsTime = newsTime;
    }

    public NewsList() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getShortAuthor() {
        return shortAuthor;
    }

    public void setShortAuthor(String shortAuthor) {
        this.shortAuthor = shortAuthor;
    }

    public String getShortStatus() {
        return shortStatus;
    }

    public void setShortStatus(String shortStatus) {
        this.shortStatus = shortStatus;
    }

    public String getShortLook() {
        return shortLook;
    }

    public void setShortLook(String shortLook) {
        this.shortLook = shortLook;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    public Date getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(Date newsTime) {
        this.newsTime = newsTime;
    }

    @Override
    public String toString() {
        return "NewsList{" +
                "id=" + id +
                ", shortName='" + shortName + '\'' +
                ", longName='" + longName + '\'' +
                ", desc='" + desc + '\'' +
                ", shortAuthor='" + shortAuthor + '\'' +
                ", shortStatus='" + shortStatus + '\'' +
                ", shortLook='" + shortLook + '\'' +
                ", isShow='" + isShow + '\'' +
                ", newsTime=" + newsTime +
                '}';
    }
}
