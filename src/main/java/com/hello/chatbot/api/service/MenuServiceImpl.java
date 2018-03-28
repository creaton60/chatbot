package com.hello.chatbot.api.service;

import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService{
    @Override
    public ChatBotApiMessage createMenu(ChatBotClientMessage message) {
        return null;
    }

    @Override
    public ChatBotApiMessage updateMenu(ChatBotClientMessage message) {
        return null;
    }

    @Override
    public ChatBotApiMessage getMenuInfo(int menuId) {
        return null;
    }
}
