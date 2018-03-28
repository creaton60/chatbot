package com.hello.chatbot.common.api.builder.menu;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.api.ApiMessageType;
import com.hello.chatbot.common.api.ChatBotApiMessage;

import java.util.List;

@JsonTypeName(ApiMessageType.ApiValues.VALUE_MENU_LIST)
public class ApiMenuListMessage extends ChatBotApiMessage{

    @JsonProperty("botId")
    private int botId;

    @JsonProperty("menus")
    private List<ApiMenuInfoMessage> menuList;

    public int getBotId() {
        return botId;
    }

    public void setBotId(int botId) {
        this.botId = botId;
    }

    public List<ApiMenuInfoMessage> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<ApiMenuInfoMessage> menuList) {
        this.menuList = menuList;
    }
}
