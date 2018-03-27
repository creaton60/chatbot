package com.hello.chatbot.api.service;

import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import org.springframework.stereotype.Service;

@Service
public class BotServiceImpl implements BotService{

    @Override
    public ChatBotApiMessage createChatBot(ChatBotClientMessage message) {
        return null;
    }

    @Override
    public ChatBotApiMessage updateChatBot(ChatBotClientMessage message) {
        return null;
    }

    @Override
    public ChatBotApiMessage getChatBotInfo(int botId) {
        return null;
    }

    @Override
    public ChatBotApiMessage getChatBotList() {
        return null;
    }

    @Override
    public ChatBotApiMessage withDrawChatBot(int botId) {
        return null;
    }
}
