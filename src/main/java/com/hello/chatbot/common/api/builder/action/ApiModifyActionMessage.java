package com.hello.chatbot.common.api.builder.action;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.api.ApiMessageType;
import com.hello.chatbot.common.api.ChatBotApiMessage;

@JsonTypeName(ApiMessageType.ApiValues.VALUE_ACTION_MODIFY)
public class ApiModifyActionMessage extends ChatBotApiMessage{

    @JsonProperty("botId")
    private int botId;

    @JsonProperty("eventId")
    private int eventId;

    @JsonProperty("actionId")
    private int actionid;

    public int getBotId() {
        return botId;
    }

    public void setBotId(int botId) {
        this.botId = botId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getActionid() {
        return actionid;
    }

    public void setActionid(int actionid) {
        this.actionid = actionid;
    }
}
