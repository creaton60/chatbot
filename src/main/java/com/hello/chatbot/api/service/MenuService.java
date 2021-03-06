package com.hello.chatbot.api.service;

import com.hello.chatbot.api.domain.BotMenu;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;

public interface MenuService {

    ChatBotApiMessage createMenu(ChatBotClientMessage message);

    ChatBotApiMessage updateMenu(ChatBotClientMessage message);

    ChatBotApiMessage getMenuInfo(int menuId);

    ChatBotApiMessage getMenuList(int botId);

    BotMenu getMenu(int menuId);

    ChatBotApiMessage deleteMenu(int menuId);
}
