package com.hello.chatbot.common.client.action;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.ClientMessageType;
import com.hello.chatbot.common.data.BotActionType;

@JsonTypeName(ClientMessageType.ClientValues.VALUE_ACTION_MODIFY)
public class ClientModifyActionMessage extends ChatBotClientMessage{

    private int actionId;

    private BotActionType actionType;

    private String context;

    public int getActionId() {
        return actionId;
    }

    public void setActionId(int actionId) {
        this.actionId = actionId;
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
