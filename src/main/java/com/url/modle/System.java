package com.url.modle;

import java.util.Date;

/**
 * 系统参数
 * @author YI
 * @data 2018-4-14 12:21:29
 */
public class System {
    private int id;
    private String server;
    private String dataBaseVersion;
    private String userRights;
    private String keywords;
    private String cmsName;
    private String author;
    private String record;
    private String powerby;
    private String version;
    private String homePage;
    private String maxUpload;
    private String description;
    private Date crtTime = new Date();

    public System() {
        super();
    }

    public System(String server, String dataBaseVersion, String userRights, String keywords, String cmsName, String author, String record, String powerby, String version, String homePage, String maxUpload, String description, Date crtTime) {
        this.server = server;
        this.dataBaseVersion = dataBaseVersion;
        this.userRights = userRights;
        this.keywords = keywords;
        this.cmsName = cmsName;
        this.author = author;
        this.record = record;
        this.powerby = powerby;
        this.version = version;
        this.homePage = homePage;
        this.maxUpload = maxUpload;
        this.description = description;
        this.crtTime = crtTime;
    }

    public System(int id, String server, String dataBaseVersion, String userRights, String keywords, String cmsName, String author, String record, String powerby, String version, String homePage, String maxUpload, String description, Date crtTime) {
        this.id = id;
        this.server = server;
        this.dataBaseVersion = dataBaseVersion;
        this.userRights = userRights;
        this.keywords = keywords;
        this.cmsName = cmsName;
        this.author = author;
        this.record = record;
        this.powerby = powerby;
        this.version = version;
        this.homePage = homePage;
        this.maxUpload = maxUpload;
        this.description = description;
        this.crtTime = crtTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getdataBaseVersion() {
        return dataBaseVersion;
    }

    public void setdataBaseVersion(String dataBaseVersion) {
        this.dataBaseVersion = dataBaseVersion;
    }

    public String getUserRights() {
        return userRights;
    }

    public void setUserRights(String userRights) {
        this.userRights = userRights;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getCmsName() {
        return cmsName;
    }

    public void setCmsName(String cmsName) {
        this.cmsName = cmsName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public String getPowerby() {
        return powerby;
    }

    public void setPowerby(String powerby) {
        this.powerby = powerby;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getMaxUpload() {
        return maxUpload;
    }

    public void setMaxUpload(String maxUpload) {
        this.maxUpload = maxUpload;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    @Override
    public String toString() {
        return "System{" +
                "id=" + id +
                ", server='" + server + '\'' +
                ", dataBaseVersion='" + dataBaseVersion + '\'' +
                ", userRights='" + userRights + '\'' +
                ", keywords='" + keywords + '\'' +
                ", cmsName='" + cmsName + '\'' +
                ", author='" + author + '\'' +
                ", record='" + record + '\'' +
                ", powerby='" + powerby + '\'' +
                ", version='" + version + '\'' +
                ", homePage='" + homePage + '\'' +
                ", maxUpload='" + maxUpload + '\'' +
                ", description='" + description + '\'' +
                ", crtTime=" + crtTime +
                '}';
    }
}
