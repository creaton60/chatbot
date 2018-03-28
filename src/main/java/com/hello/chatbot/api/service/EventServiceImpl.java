package com.hello.chatbot.api.service;

import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import org.springframework.stereotype.Service;


@Service
public class EventServiceImpl implements EventService{
    @Override
    public ChatBotApiMessage createEvent(ChatBotClientMessage message) {
        return null;
    }

    @Override
    public ChatBotApiMessage modifyEvent(ChatBotClientMessage message) {
        return null;
    }

    @Override
    public ChatBotApiMessage getMenuList(int botId) {
        return null;
    }
}
