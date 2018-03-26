package com.hello.chatbot.api.domain;

import javax.persistence.Entity;

@Entity(name = "cb_bot_cards")
public class BotCards {

    private int cardId;

    private String cardName;

    private CardType cardType;


}
