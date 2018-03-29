package com.hello.chatbot.api.service;

import com.hello.chatbot.api.domain.*;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.data.BotEventType;

public interface EventService {

    ChatBotApiMessage createEvent(ChatBotClientMessage message);

    ChatBotApiMessage modifyEvent(ChatBotClientMessage message);

    BotEvents getEvent(int eventId);

    BotEvents getEventWithChatSeq(Bots bot, BotMenu menu, int eventSeq);

    BotEvents getEventWithButton(Bots bot, BotMenu menu, int eventSeq, BotButtons button);

    BotEvents getEventWithCard(Bots bot, BotMenu menu, int eventSeq, BotCards card);

    BotEvents getEventWithType(Bots bot, BotEventType type);

    BotEvents getEventWithSelectOne(Bots bot, BotEventType type, BotMenu menu, int eventSeq);
}
