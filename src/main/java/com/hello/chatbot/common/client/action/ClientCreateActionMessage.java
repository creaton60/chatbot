package com.hello.chatbot.common.client.action;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.ClientMessageType;

@JsonTypeName(ClientMessageType.ClientValues.VALUE_ACTION_CREATE)
public class ClientCreateActionMessage extends ChatBotClientMessage{

    @JsonProperty("botId")
    private int botId;

    @JsonProperty("eventId")
    private int eventId;


}
