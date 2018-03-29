package com.hello.chatbot.common.api.builder.card;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.api.ApiMessageType;
import com.hello.chatbot.common.api.ChatBotApiMessage;

import java.util.List;

@JsonTypeName(ApiMessageType.ApiValues.VALUE_CARDS_LIST)
public class ApiCardListMessage extends ChatBotApiMessage{

    @JsonProperty("cardId")
    private int cardId;

    @JsonProperty("cardList")
    private List<ApiCardInfoMessage> cardList;

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public List<ApiCardInfoMessage> getCardList() {
        return cardList;
    }

    public void setCardList(List<ApiCardInfoMessage> cardList) {
        this.cardList = cardList;
    }
}
