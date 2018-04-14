package com.url.modle;

import java.util.List;

/**
 * 留言
 * @author YI
 * @data 2018-4-14 12:10:33
 */
public class Message {
    private Integer id;
    private String askTime;
    private String userAsk;
    private List<MsgReply> msgReply;
    private String userName;
    private String userface;

    public Message() {
        super();
    }

    public Message(String askTime, String userAsk, List<MsgReply> msgReply, String userName, String userface) {
        this.askTime = askTime;
        this.userAsk = userAsk;
        this.msgReply = msgReply;
        this.userName = userName;
        this.userface = userface;
    }

    public Message(Integer id, String askTime, String userAsk, List<MsgReply> msgReply, String userName, String userface) {
        this.id = id;
        this.askTime = askTime;
        this.userAsk = userAsk;
        this.msgReply = msgReply;
        this.userName = userName;
        this.userface = userface;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<MsgReply> getMsgReply() {
        return msgReply;
    }

    public void setMsgReply(List<MsgReply> msgReply) {
        this.msgReply = msgReply;
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
        return "Message{" +
                "id=" + id +
                ", askTime='" + askTime + '\'' +
                ", userAsk='" + userAsk + '\'' +
                ", id='" + id + '\'' +
                ", msgReply=" + msgReply +
                ", userName='" + userName + '\'' +
                ", userface='" + userface + '\'' +
                '}';
    }
}
