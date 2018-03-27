package com.hello.chatbot.api.service;

import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import org.springframework.stereotype.Service;

@Service
public class ActionServiceImpl implements ActionService{
    @Override
    public ChatBotApiMessage createAction(ChatBotClientMessage message) {
        return null;
    }

    @Override
    public ChatBotApiMessage updateAction(ChatBotClientMessage message) {
        return null;
    }
}
