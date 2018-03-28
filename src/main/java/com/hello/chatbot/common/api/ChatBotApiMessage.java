package com.hello.chatbot.common.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.hello.chatbot.common.api.builder.*;
import com.hello.chatbot.common.api.builder.action.ApiCreateActionMessage;
import com.hello.chatbot.common.api.builder.action.ApiModifyActionMessage;
import com.hello.chatbot.common.api.builder.card.ApiCardInfoMessage;
import com.hello.chatbot.common.api.builder.card.ApiCardListMessage;
import com.hello.chatbot.common.api.builder.card.ApiCreateCardDetailMessage;
import com.hello.chatbot.common.api.builder.card.ApiCreateCardsMessage;
import com.hello.chatbot.common.api.builder.event.ApiCreateEventMessage;
import com.hello.chatbot.common.api.builder.event.ApiEventInfoMessage;
import com.hello.chatbot.common.api.builder.menu.ApiMenuCreateMessage;
import com.hello.chatbot.common.api.builder.menu.ApiMenuInfoMessage;
import com.hello.chatbot.common.api.builder.menu.ApiMenuListMessage;
import com.hello.chatbot.common.api.builder.menu.ApiMenuModifyMessage;
import com.hello.chatbot.common.api.chat.ApiChatInfoMessage;
import com.hello.chatbot.common.api.chat.ApiChatReactionMessage;
import com.hello.chatbot.common.api.error.ApiErrorMessage;
import org.springframework.http.HttpStatus;

@JsonTypeInfo(
        use=JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ApiBotCreateMessage.class, name = ApiMessageType.ApiValues.VALUE_BOT_CREATE),
        @JsonSubTypes.Type(value = ApiBotModifyMessage.class, name = ApiMessageType.ApiValues.VALUE_BOT_MODIFY),
        @JsonSubTypes.Type(value = ApiBotInfoMessage.class, name = ApiMessageType.ApiValues.VALUE_BOT_INFO),
        @JsonSubTypes.Type(value = ApiBotListMessage.class, name = ApiMessageType.ApiValues.VALUE_BOT_LIST),
        @JsonSubTypes.Type(value = ApiBotWithDrawMessage.class, name = ApiMessageType.ApiValues.VALUE_BOT_WITHDRAW),
        @JsonSubTypes.Type(value = ApiCreateActionMessage.class, name = ApiMessageType.ApiValues.VALUE_ACTION_CREATE),
        @JsonSubTypes.Type(value = ApiModifyActionMessage.class, name = ApiMessageType.ApiValues.VALUE_ACTION_MODIFY),
        @JsonSubTypes.Type(value = ApiCreateEventMessage.class, name = ApiMessageType.ApiValues.VALUE_EVENT_CREATE),
        @JsonSubTypes.Type(value = ApiModifyActionMessage.class, name = ApiMessageType.ApiValues.VALUE_EVENT_MODIFY),
        @JsonSubTypes.Type(value = ApiEventInfoMessage.class, name = ApiMessageType.ApiValues.VALUE_EVENT_INFO),
        @JsonSubTypes.Type(value = ApiChatInfoMessage.class, name = ApiMessageType.ApiValues.VALUE_CHAT_INFO),
        @JsonSubTypes.Type(value = ApiChatReactionMessage.class, name = ApiMessageType.ApiValues.VALUE_CHAT_REACTION),
        @JsonSubTypes.Type(value = ApiCreateCardsMessage.class, name = ApiMessageType.ApiValues.VALUE_CARDS_CREATE),
        @JsonSubTypes.Type(value = ApiCardInfoMessage.class, name = ApiMessageType.ApiValues.VALUE_CARDS_INFO),
        @JsonSubTypes.Type(value = ApiCreateCardDetailMessage.class, name = ApiMessageType.ApiValues.VALUE_CARDS_CREATE_DETAIL),
        @JsonSubTypes.Type(value = ApiCardListMessage.class, name = ApiMessageType.ApiValues.VALUE_CARDS_LIST),
        @JsonSubTypes.Type(value = ApiMenuCreateMessage.class, name = ApiMessageType.ApiValues.VALUE_MENU_CREATE),
        @JsonSubTypes.Type(value = ApiMenuModifyMessage.class, name = ApiMessageType.ApiValues.VALUE_MENU_MODIFY),
        @JsonSubTypes.Type(value = ApiMenuInfoMessage.class, name = ApiMessageType.ApiValues.VALUE_MENU_INFO),
        @JsonSubTypes.Type(value = ApiMenuListMessage.class, name = ApiMessageType.ApiValues.VALUE_MENU_LIST),
        @JsonSubTypes.Type(value = ApiErrorMessage.class, name = ApiMessageType.ApiValues.VALUE_ERROR)

})
public abstract class ChatBotApiMessage {
    @JsonProperty("statusCode")
    private HttpStatus status;

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
