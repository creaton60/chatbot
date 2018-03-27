package com.hello.chatbot.common.api.builder.card;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.api.ApiMessageType;
import com.hello.chatbot.common.api.ChatBotApiMessage;

@JsonTypeName(ApiMessageType.ApiValues.VALUE_CARDS_INFO)
public class ApiCardInfoMessage extends ChatBotApiMessage{

    @JsonProperty("cardId")
    private int cardId;

    @JsonProperty("cardName")
    private String cardName;

    @JsonProperty("direction")
    private int direction;

    @JsonProperty("imagePath")
    private String imagePath;

    @JsonProperty("desc")
    private String cardDesc;

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getCardDesc() {
        return cardDesc;
    }

    public void setCardDesc(String cardDesc) {
        this.cardDesc = cardDesc;
    }
}
