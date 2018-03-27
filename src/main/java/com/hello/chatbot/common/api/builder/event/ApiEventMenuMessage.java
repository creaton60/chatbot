package com.hello.chatbot.common.api.builder.event;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.api.ApiMessageType;
import com.hello.chatbot.common.api.ChatBotApiMessage;

@JsonTypeName(ApiMessageType.ApiValues.VALUE_EVENT_MENU)
public class ApiEventMenuMessage extends ChatBotApiMessage{
}
