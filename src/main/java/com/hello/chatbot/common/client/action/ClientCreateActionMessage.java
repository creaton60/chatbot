package com.hello.chatbot.common.client.action;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.ClientMessageType;
import com.hello.chatbot.common.data.BotActionType;

@JsonTypeName(ClientMessageType.ClientValues.VALUE_ACTION_CREATE)
public class ClientCreateActionMessage extends ChatBotClientMessage{

    @JsonProperty("botId")
    private int botId;

    @JsonProperty("eventId")
    private int eventId;

    @JsonProperty("actionName")
    private String actionName;

    @JsonProperty("actionType")
    private BotActionType actionType;

    @JsonProperty("actionContext")
    private String context;

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

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public BotActionType getActionType() {
        return actionType;
    }

    public void setActionType(BotActionType actionType) {
        this.actionType = actionType;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
