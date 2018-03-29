package com.hello.chatbot.api.service;

import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;

public interface ChatService {

    ChatBotApiMessage processChatEvent(ChatBotClientMessage messagae);

}
