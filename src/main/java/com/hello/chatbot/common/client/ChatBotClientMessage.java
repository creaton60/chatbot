package com.hello.chatbot.common.client;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.hello.chatbot.common.client.action.ClientCreateActionMessage;
import com.hello.chatbot.common.client.action.ClientModifyActionMessage;
import com.hello.chatbot.common.client.bot.ClientCreateBotMessage;
import com.hello.chatbot.common.client.bot.ClientModifyBotMessage;
import com.hello.chatbot.common.client.card.ClientCreateCardInfoMessage;
import com.hello.chatbot.common.client.card.ClientCreateCardMessage;
import com.hello.chatbot.common.client.chat.ClientChatMessage;
import com.hello.chatbot.common.client.event.ClientCreateEventMessage;
import com.hello.chatbot.common.client.event.ClientModifyEventMessage;

@JsonTypeInfo(
        use=JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ClientCreateActionMessage.class, name = ClientMessageType.ClientValues.VALUE_ACTION_CREATE),
        @JsonSubTypes.Type(value = ClientModifyActionMessage.class, name = ClientMessageType.ClientValues.VALUE_ACTION_MODIFY),
        @JsonSubTypes.Type(value = ClientCreateBotMessage.class, name = ClientMessageType.ClientValues.VALUE_NEW_BOT),
        @JsonSubTypes.Type(value = ClientModifyBotMessage.class, name = ClientMessageType.ClientValues.VALUE_BOT_MODIFY),
        @JsonSubTypes.Type(value = ClientChatMessage.class, name = ClientMessageType.ClientValues.VALUE_CHAT_EVENT),
        @JsonSubTypes.Type(value = ClientCreateCardMessage.class, name = ClientMessageType.ClientValues.VALUE_CARD_CREATE),
        @JsonSubTypes.Type(value = ClientCreateCardInfoMessage.class, name = ClientMessageType.ClientValues.VALUE_CARD_DETAIL_CREATE),
        @JsonSubTypes.Type(value = ClientCreateEventMessage.class, name = ClientMessageType.ClientValues.VALUE_EVENT_CREATE),
        @JsonSubTypes.Type(value = ClientModifyEventMessage.class, name = ClientMessageType.ClientValues.VALUE_EVENT_MODIFY)
})
public abstract class ChatBotClientMessage {
}
