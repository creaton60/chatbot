package com.hello.chatbot.api.domain;

import com.hello.chatbot.common.data.BotEventType;

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

    @Column(name = "event_desc", nullable = false)
    private String eventDesc;

    @Column(name = "event_seq", columnDefinition = "int default 0")
    private int eventSeq;

    @ManyToOne(targetEntity = BotMenu.class)
    @JoinColumn(name = "menu_id")
    private BotMenu menu;

    @ManyToOne(targetEntity = BotButtons.class)
    @JoinColumn(name = "button_id")
    private BotButtons button;

    @ManyToOne
    @JoinColumn(name = "card_id")
    private BotCards card;



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

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public int getEventSeq() {
        return eventSeq;
    }

    public void setEventSeq(int eventSeq) {
        this.eventSeq = eventSeq;
    }

    public BotMenu getMenu() {
        return menu;
    }

    public void setMenu(BotMenu menu) {
        this.menu = menu;
    }

    public BotButtons getButton() {
        return button;
    }

    public void setButton(BotButtons button) {
        this.button = button;
    }

    public BotCards getCard() {
        return card;
    }

    public void setCard(BotCards card) {
        this.card = card;
    }
}
