package com.hello.chatbot.api.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "cb_bot_cards")
public class BotCards implements Serializable {

    @Id
    @Column(name = "card_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cardId;

    @Column(name = "card_list_name")
    private String cardListName;

    @Enumerated(EnumType.STRING)
    @Column(name = "card_type")
    private CardType cardType;

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardListName() {
        return cardListName;
    }

    public void setCardListName(String cardListName) {
        this.cardListName = cardListName;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
