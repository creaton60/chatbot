package com.hello.chatbot.api.service;

import com.hello.chatbot.api.domain.BotCardDetail;
import com.hello.chatbot.api.domain.BotCards;
import com.hello.chatbot.api.repository.CardDetailRepository;
import com.hello.chatbot.api.repository.CardRepository;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService{
    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private CardDetailRepository detailRepository;

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

    @Override
    public BotCards getCard(int cardId) {

        BotCards card = cardRepository.findOne(cardId);

        return card;
    }

    @Override
    public BotCardDetail getCardDetail(int detailId) {

        BotCardDetail detail = detailRepository.findOne(detailId);

        return detail;
    }
}
