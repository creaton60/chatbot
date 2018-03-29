package com.hello.chatbot.common.client.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.ClientMessageType;
import com.hello.chatbot.common.data.BotEventType;

@JsonTypeName(ClientMessageType.ClientValues.VALUE_EVENT_CREATE)
public class ClientCreateEventMessage extends ChatBotClientMessage{

    @JsonProperty("botId")
    private int botId;

    @JsonProperty("eventName")
    private String eventName;

    @JsonProperty("eventType")
    private BotEventType eventType;

    @JsonProperty("desc")
    private String eventDesc;

    @JsonProperty("seq")
    private int eventSeq;

    @JsonProperty("menuId")
    private int menuId;

    public int getBotId() {
        return botId;
    }

    public void setBotId(int botId) {
        this.botId = botId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public BotEventType getEventType() {
        return eventType;
    }

    public void setEventType(BotEventType eventType) {
        this.eventType = eventType;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public int getEventSeq() {
        return eventSeq;
    }

    public void setEventSeq(int eventSeq) {
        this.eventSeq = eventSeq;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }
}
