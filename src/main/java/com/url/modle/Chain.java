package com.url.modle;

import java.util.Date;

/**
 * 友链
 * @author YI
 * @date 2018-4-14 12:06:37
 */
public class Chain {
    private int id;
    private String linksName;
    private String linksUrl;
    private String masterEmail;
    private String showAddress;
    private int status;
    private Date crtTime;

    public Chain() {
        super();
    }

    public Chain(String linksName, String linksUrl, String masterEmail, String showAddress, int status, Date crtTime) {
        this.linksName = linksName;
        this.linksUrl = linksUrl;
        this.masterEmail = masterEmail;
        this.showAddress = showAddress;
        this.status = status;
        this.crtTime = crtTime;
    }

    public Chain(int id, String linksName, String linksUrl, String masterEmail, String showAddress, int status, Date crtTime) {
        this.id = id;
        this.linksName = linksName;
        this.linksUrl = linksUrl;
        this.masterEmail = masterEmail;
        this.showAddress = showAddress;
        this.status = status;
        this.crtTime = crtTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLinksName() {
        return linksName;
    }

    public void setLinksName(String linksName) {
        this.linksName = linksName;
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public String getLinksUrl() {
        return linksUrl;
    }

    public void setLinksUrl(String linksUrl) {
        this.linksUrl = linksUrl;
    }

    public String getMasterEmail() {
        return masterEmail;
    }

    public void setMasterEmail(String masterEmail) {
        this.masterEmail = masterEmail;
    }

    public String getShowAddress() {
        return showAddress;
    }

    public void setShowAddress(String showAddress) {
        this.showAddress = showAddress;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LinksList{" +
                "id=" + id +
                ", linksName='" + linksName + '\'' +
                ", crtTime='" + crtTime + '\'' +
                ", linksUrl='" + linksUrl + '\'' +
                ", masterEmail='" + masterEmail + '\'' +
                ", showAddress='" + showAddress + '\'' +
                ", status=" + status +
                ", crtTime=" + crtTime +
                '}';
    }
}
