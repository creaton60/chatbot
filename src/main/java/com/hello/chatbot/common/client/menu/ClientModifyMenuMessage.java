package com.hello.chatbot.common.client.menu;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.ClientMessageType;
import com.hello.chatbot.common.data.BillType;

@JsonTypeName(ClientMessageType.ClientValues.VALUE_MENU_MODIFY)
public class ClientModifyMenuMessage extends ChatBotClientMessage{

    @JsonProperty("botId")
    private int botId;

    @JsonProperty("menuId")
    private int menuId;

    @JsonProperty("menuName")
    private String menuName;

    @JsonProperty("billType")
    private BillType billType;

    @JsonProperty("price")
    private int price;

    public int getBotId() {
        return botId;
    }

    public void setBotId(int botId) {
        this.botId = botId;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
