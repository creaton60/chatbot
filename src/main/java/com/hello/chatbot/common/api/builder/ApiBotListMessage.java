package com.hello.chatbot.common.api.builder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.api.ChatBotApiMessage;

import java.util.List;

@JsonTypeName
public class ApiBotListMessage extends ChatBotApiMessage{

    @JsonProperty("chatbots")
    private List<ApiBotInfoMessage> botList;

    public List<ApiBotInfoMessage> getBotList() {
        return botList;
    }

    public void setBotList(List<ApiBotInfoMessage> botList) {
        this.botList = botList;
    }
}
