package com.hello.chatbot.common.client.bot;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.ClientMessageType;

@JsonTypeName(ClientMessageType.ClientValues.VALUE_NEW_BOT)
public class ClientCreateBotMessage extends ChatBotClientMessage{

    @JsonProperty("name")
    private String botName;

    @JsonProperty("botType")
    private String botType;

    @JsonProperty("desc")
    private String botDesc;

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getBotType() {
        return botType;
    }

    public void setBotType(String botType) {
        this.botType = botType;
    }

    public String getBotDesc() {
        return botDesc;
    }

    public void setBotDesc(String botDesc) {
        this.botDesc = botDesc;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getBotName(),this.getBotDesc(),this.getBotType());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        ClientCreateBotMessage target = (ClientCreateBotMessage) obj;

        return Objects.equal(this.getBotDesc() , target.getBotDesc()) &&
                Objects.equal(this.getBotName(), target.getBotName()) &&
                Objects.equal(this.getBotType(), target.getBotType());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", getBotName())
                .add("type", getBotType())
                .add("desc", getBotDesc())
                .toString();
    }
}
