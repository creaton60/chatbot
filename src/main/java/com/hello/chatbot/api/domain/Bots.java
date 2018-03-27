package com.hello.chatbot.api.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity(name = "cb_bots")
public class Bots implements Serializable{

    @Id
    @Column(name = "bot_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int botId;

    @Column(name = "bot_name", length = 32, nullable = false)
    private String botName;

    @Column(name = "bot_type", length = 16, nullable = false)
    private String botType;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "reg_date")
    private Date regDate;

    @Column(name = "bot_desc", length = 50)
    private String desc;

    @Column(name="subscrpition", nullable = false, columnDefinition = "int default 0")
    private int subscription;

    public int getBotId() {
        return botId;
    }

    public void setBotId(int botId) {
        this.botId = botId;
    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getBotType() {
        return botType;
    }

    public void setBotType(String botType) {
        this.botType = botType;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getSubscription() {
        return subscription;
    }

    public void setSubscription(int subscription) {
        this.subscription = subscription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bots bots = (Bots) o;
        return botId == bots.botId &&
                subscription == bots.subscription &&
                Objects.equals(botName, bots.botName) &&
                Objects.equals(botType, bots.botType) &&
                Objects.equals(regDate, bots.regDate) &&
                Objects.equals(desc, bots.desc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(botId, botName, botType, regDate, desc, subscription);
    }
}
