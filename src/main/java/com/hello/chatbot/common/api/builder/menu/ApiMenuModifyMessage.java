package com.hello.chatbot.common.api.builder.menu;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.api.ApiMessageType;
import com.hello.chatbot.common.api.ChatBotApiMessage;

@JsonTypeName(ApiMessageType.ApiValues.VALUE_MENU_MODIFY)
public class ApiMenuModifyMessage extends ChatBotApiMessage{
}
