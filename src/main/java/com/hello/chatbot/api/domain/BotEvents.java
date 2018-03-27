package com.hello.chatbot.api.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "cb_bot_events")
public class BotEvents implements Serializable{

    @Id
    @Column(name = "event_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "event_type", nullable = false)
    private BotEventType eventType;

    @Column(name = "event_name", nullable = false)
    private String eventName;

    @ManyToOne(targetEntity = Bots.class)
    @JoinColumn(name = "bot_id", nullable = false)
    private Bots bot;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "event_reg_date")
    private Date regDate;

    @Column(name="subscrpition", nullable = false, columnDefinition = "int default 0")
    private int subscription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BotEventType getEventType() {
        return eventType;
    }

    public void setEventType(BotEventType eventType) {
        this.eventType = eventType;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Bots getBot() {
        return bot;
    }

    public void setBot(Bots bot) {
        this.bot = bot;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public int getSubscription() {
        return subscription;
    }

    public void setSubscription(int subscription) {
        this.subscription = subscription;
    }
}
