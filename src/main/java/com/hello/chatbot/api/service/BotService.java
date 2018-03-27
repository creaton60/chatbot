package com.hello.chatbot.api.service;

import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;

public interface BotService {

    ChatBotApiMessage createChatBot(ChatBotClientMessage message);

    ChatBotApiMessage updateChatBot(ChatBotClientMessage message);

    ChatBotApiMessage getChatBotInfo(int botId);

    ChatBotApiMessage getChatBotList();

    ChatBotApiMessage withDrawChatBot(int botId);
}
