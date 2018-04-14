package com.url.modle;

/**
 * 留言回复
 * @author YI
 * @data 2018-4-14 12:10:54
 */
public class MsgReply {
    private String askTime;
    private String userAsk;
    private String userName;
    private String userface;

    public MsgReply(String askTime, String userAsk, String userName, String userface) {
        this.askTime = askTime;
        this.userAsk = userAsk;
        this.userName = userName;
        this.userface = userface;
    }

    public MsgReply() {
        super();
    }

    public String getAskTime() {
        return askTime;
    }

    public void setAskTime(String askTime) {
        this.askTime = askTime;
    }

    public String getUserAsk() {
        return userAsk;
    }

    public void setUserAsk(String userAsk) {
        this.userAsk = userAsk;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserface() {
        return userface;
    }

    public void setUserface(String userface) {
        this.userface = userface;
    }

    @Override
    public String toString() {
        return "MsgReply{" +
                "askTime='" + askTime + '\'' +
                ", userAsk='" + userAsk + '\'' +
                ", userName='" + userName + '\'' +
                ", userface='" + userface + '\'' +
                '}';
    }
}
