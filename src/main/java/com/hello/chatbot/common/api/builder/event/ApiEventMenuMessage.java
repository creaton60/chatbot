package com.hello.chatbot.common.api.builder.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.api.ApiMessageType;
import com.hello.chatbot.common.api.ChatBotApiMessage;

import java.util.List;

@JsonTypeName(ApiMessageType.ApiValues.VALUE_EVENT_MENU)
public class ApiEventMenuMessage extends ChatBotApiMessage{

    @JsonProperty("botId")
    private int botId;

    @JsonProperty("menu")
    private List<ApiEventInfoMessage> menuList;

    public int getBotId() {
        return botId;
    }

    public void setBotId(int botId) {
        this.botId = botId;
    }

    public List<ApiEventInfoMessage> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<ApiEventInfoMessage> menuList) {
        this.menuList = menuList;
    }
}
