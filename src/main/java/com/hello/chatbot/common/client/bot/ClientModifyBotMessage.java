package com.hello.chatbot.common.client.bot;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.ClientMessageType;

@JsonTypeName(ClientMessageType.ClientValues.VALUE_BOT_MODIFY)
public class ClientModifyBotMessage extends ChatBotClientMessage{

    @JsonProperty("botId")
    private int botId;

    @JsonProperty("botType")
    private String botType;

    @JsonProperty("botName")
    private String botName;

    @JsonProperty("botDesc")
    private String botDesc;

    public int getBotId() {
        return botId;
    }

    public void setBotId(int botId) {
        this.botId = botId;
    }

    public String getBotType() {
        return botType;
    }

    public void setBotType(String botType) {
        this.botType = botType;
    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getBotDesc() {
        return botDesc;
    }

    public void setBotDesc(String botDesc) {
        this.botDesc = botDesc;
    }
}
