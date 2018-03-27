package com.hello.chatbot.api.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "cb_chat_log")
public class BotChatLog implements Serializable{

    @Id
    @Column(name = "chat_log_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int logId;

    @Column(name = "bot_id")
    private int botId;

    @Column(name = "chat_log_desc")
    private String logDesc;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "log_date")
    private Date logDate;

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public int getBotId() {
        return botId;
    }

    public void setBotId(int botId) {
        this.botId = botId;
    }

    public String getLogDesc() {
        return logDesc;
    }

    public void setLogDesc(String logDesc) {
        this.logDesc = logDesc;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }
}
