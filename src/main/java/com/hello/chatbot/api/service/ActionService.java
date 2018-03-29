package com.hello.chatbot.api.service;

import com.hello.chatbot.api.domain.BotActions;
import com.hello.chatbot.api.domain.BotEvents;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;

import java.util.List;

public interface ActionService {

    ChatBotApiMessage createAction(ChatBotClientMessage message);

    ChatBotApiMessage updateAction(ChatBotClientMessage message);

    List<BotActions> getActionList(BotEvents event);
}
