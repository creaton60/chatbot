package com.hello.chatbot.common.api.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.api.ApiMessageType;
import com.hello.chatbot.common.api.ChatBotApiMessage;

import java.util.List;

@JsonTypeName(ApiMessageType.ApiValues.VALUE_CHAT_REACTION)
public class ApiChatReactionMessage extends ChatBotApiMessage{

    @JsonProperty("botId")
    private int botId;

    @JsonProperty("eventId")
    private int eventId;

    @JsonProperty("reactions")
    private List<ApiChatInfoMessage> reactionList;

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

    public List<ApiChatInfoMessage> getReactionList() {
        return reactionList;
    }

    public void setReactionList(List<ApiChatInfoMessage> reactionList) {
        this.reactionList = reactionList;
    }
}
