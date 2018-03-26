package com.hello.chatbot.api.domain;

import javax.persistence.Entity;

@Entity(name = "cb_bot_events")
public class BotEvents {
    private int id;

    private BotEventType eventType;

    private String eventName;

    private Bots bot;



}
