package com.hello.chatbot.common.api.builder;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.api.ApiMessageType;
import com.hello.chatbot.common.api.ChatBotApiMessage;

@JsonTypeName(ApiMessageType.ApiValues.VALUE_BOT_WITHDRAW)
public class ApiBotWithDrawMessage extends ChatBotApiMessage{
}
