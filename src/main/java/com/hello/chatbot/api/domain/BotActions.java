package com.hello.chatbot.api.domain;

import javax.persistence.Entity;

@Entity(name = "cb_actions")
public class BotActions {
    private int actionId;

    private BotActionType type;

    private BotEvents event;


}
