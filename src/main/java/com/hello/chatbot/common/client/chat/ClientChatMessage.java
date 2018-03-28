package com.hello.chatbot.common.client.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.ClientMessageType;
import com.hello.chatbot.common.data.BotEventType;

@JsonTypeName(ClientMessageType.ClientValues.VALUE_CHAT_EVENT)
public class ClientChatMessage extends ChatBotClientMessage{

    @JsonProperty("botId")
    private int botId;

    @JsonProperty("menuId")
    private int menuId;

    @JsonProperty("evetSeq")
    private int eventSeq;

    @JsonProperty("eventType")
    private BotEventType eventType;

    @JsonProperty("text")
    private String text;

    public int getBotId() {
        return botId;
    }

    public void setBotId(int botId) {
        this.botId = botId;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getEventSeq() {
        return eventSeq;
    }

    public void setEventSeq(int eventSeq) {
        this.eventSeq = eventSeq;
    }

    public BotEventType getEventType() {
        return eventType;
    }

    public void setEventType(BotEventType eventType) {
        this.eventType = eventType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
