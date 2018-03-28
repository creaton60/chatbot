package com.hello.chatbot.common.api.builder.card;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.api.ApiMessageType;
import com.hello.chatbot.common.api.ChatBotApiMessage;

@JsonTypeName(ApiMessageType.ApiValues.VALUE_CARDS_CREATE_DETAIL)
public class ApiCreateCardDetailMessage extends ChatBotApiMessage{
}
