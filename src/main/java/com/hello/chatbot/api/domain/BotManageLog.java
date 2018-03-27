package com.hello.chatbot.api.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "cb_manage_log")
public class BotManageLog implements Serializable{

    @Id
    @Column(name = "manage_log_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int logId;

    @Enumerated(EnumType.STRING)
    @Column(name = "manage_og_type")
    private ManageLogType logType;

    @Column(name = "manage_log_desc")
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

    public ManageLogType getLogType() {
        return logType;
    }

    public void setLogType(ManageLogType logType) {
        this.logType = logType;
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
