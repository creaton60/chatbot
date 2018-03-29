package com.hello.chatbot.common.client.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.ClientMessageType;
import com.hello.chatbot.common.data.BotEventType;

@JsonTypeName(ClientMessageType.ClientValues.VALUE_EVENT_MODIFY)
public class ClientModifyEventMessage extends ChatBotClientMessage{

    @JsonProperty("eventId")
    private int eventId;

    @JsonProperty("eventName")
    private String eventName;

    @JsonProperty("seq")
    private int eventSeq;

    @JsonProperty("desc")
    private String eventDesc;

    @JsonProperty("type")
    private BotEventType eventType;

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getEventSeq() {
        return eventSeq;
    }

    public void setEventSeq(int eventSeq) {
        this.eventSeq = eventSeq;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public BotEventType getEventType() {
        return eventType;
    }

    public void setEventType(BotEventType eventType) {
        this.eventType = eventType;
    }
}
