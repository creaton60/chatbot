package com.hello.chatbot.api.domain;

import javax.persistence.Entity;

@Entity(name = "cb_actions_detail")
public class BotActionsDetail {
    private int detailId;

    private BotActions action;

    private String context;



}
