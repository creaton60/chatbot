package com.hello.chatbot.common.client.card;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.ClientMessageType;
import com.hello.chatbot.common.data.CardType;

@JsonTypeName(ClientMessageType.ClientValues.VALUE_CARD_DETAIL_CREATE)
public class ClientCreateCardInfoMessage extends ChatBotClientMessage{

    @JsonProperty("cardType")
    private CardType type;

    @JsonProperty("cardId")
    private int cardId;

    @JsonProperty("detailName")
    private String detailName;

    @JsonProperty("detailDesc")
    private String cardDesc;

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public String getCardDesc() {
        return cardDesc;
    }

    public void setCardDesc(String cardDesc) {
        this.cardDesc = cardDesc;
    }
}
