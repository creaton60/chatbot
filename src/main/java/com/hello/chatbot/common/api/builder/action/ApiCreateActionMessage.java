package com.hello.chatbot.common.api.builder.action;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.api.ApiMessageType;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.data.BotEventType;

@JsonTypeName(ApiMessageType.ApiValues.VALUE_ACTION_CREATE)
public class ApiCreateActionMessage extends ChatBotApiMessage{
}
