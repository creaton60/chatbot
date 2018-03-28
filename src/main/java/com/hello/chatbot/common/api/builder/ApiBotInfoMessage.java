package com.hello.chatbot.common.api.builder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.api.ApiMessageType;
import com.hello.chatbot.common.api.ChatBotApiMessage;

@JsonTypeName(ApiMessageType.ApiValues.VALUE_BOT_INFO)
public class ApiBotInfoMessage extends ChatBotApiMessage{

    @JsonProperty("id")
    private int botId;

    @JsonProperty("name")
    private String botName;

    @JsonProperty("type")
    private String botType;

    @JsonProperty("desc")
    private String botDesc;

    public int getBotId() {
        return botId;
    }

    public void setBotId(int botId) {
        this.botId = botId;
    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getBotType() {
        return botType;
    }

    public void setBotType(String botType) {
        this.botType = botType;
    }

    public String getBotDesc() {
        return botDesc;
    }

    public void setBotDesc(String botDesc) {
        this.botDesc = botDesc;
    }
}
