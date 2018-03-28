package com.hello.chatbot.common.client.card;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.ClientMessageType;
import com.hello.chatbot.common.data.CardType;

@JsonTypeName(ClientMessageType.ClientValues.VALUE_CARD_CREATE)
public class ClientCreateCardMessage extends ChatBotClientMessage{
    @JsonProperty("cardType")
    private CardType type;

    @JsonProperty("cardName")
    private String cardName;

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
}
