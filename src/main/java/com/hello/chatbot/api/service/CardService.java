package com.hello.chatbot.api.service;

import com.hello.chatbot.api.domain.BotCardDetail;
import com.hello.chatbot.api.domain.BotCards;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;

public interface CardService {

    ChatBotApiMessage createCard(ChatBotClientMessage message);

    ChatBotApiMessage getCardList(int cardId);

    ChatBotApiMessage getOneCardInfo(int cardId, int infoId);

    BotCards getCard(int cardId);

    BotCardDetail getCardDetail(int detailId);
}
