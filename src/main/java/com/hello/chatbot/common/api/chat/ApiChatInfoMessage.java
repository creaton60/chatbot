package com.hello.chatbot.common.api.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.common.base.MoreObjects;
import com.hello.chatbot.common.api.ApiMessageType;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.data.BotActionType;

@JsonTypeName(ApiMessageType.ApiValues.VALUE_CHAT_INFO)
public class ApiChatInfoMessage extends ChatBotApiMessage{

    @JsonProperty("actionId")
    private int actionId;

    @JsonProperty("actionType")
    private BotActionType actionType;

    @JsonProperty("imagePath")
    private String imagePath;

    @JsonProperty("context")
    private String actionContext;

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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getActionContext() {
        return actionContext;
    }

    public void setActionContext(String actionContext) {
        this.actionContext = actionContext;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("actionId", getActionId())
                .add("actionType", getActionType())
                .add("actionContext", getActionContext())
                .toString();
    }
}
