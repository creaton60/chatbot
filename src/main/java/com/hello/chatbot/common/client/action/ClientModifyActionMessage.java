package com.hello.chatbot.common.client.action;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.ClientMessageType;
import com.hello.chatbot.common.data.BotActionType;

@JsonTypeName(ClientMessageType.ClientValues.VALUE_ACTION_MODIFY)
public class ClientModifyActionMessage extends ChatBotClientMessage{

    @JsonProperty("actionId")
    private int actionId;

    @JsonProperty("actionName")
    private String actionName;

    @JsonProperty("context")
    private String context;

    public int getActionId()
    {
        return actionId;
    }

    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
