package com.hello.chatbot.common.api.builder.action;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.api.ApiMessageType;
import com.hello.chatbot.common.api.ChatBotApiMessage;

@JsonTypeName(ApiMessageType.ApiValues.VALUE_ACTION_MODIFY)
public class ApiModifyActionMessage extends ChatBotApiMessage{
}
