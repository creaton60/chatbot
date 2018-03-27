package com.hello.chatbot.api.service;

import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService{
    @Override
    public ChatBotApiMessage createCard(ChatBotClientMessage message) {
        return null;
    }

    @Override
    public ChatBotApiMessage getCardList(int cardId) {
        return null;
    }

    @Override
    public ChatBotApiMessage getOneCardInfo(int cardId, int infoId) {
        return null;
    }
}
