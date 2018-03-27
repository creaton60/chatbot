package com.hello.chatbot.common.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.hello.chatbot.common.api.builder.ApiBotCreateMessage;
import com.hello.chatbot.common.api.error.ApiErrorMessage;
import org.springframework.http.HttpStatus;

@JsonTypeInfo(
        use=JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ApiBotCreateMessage.class, name=ApiMessageType.ApiValues.VALUE_BOT_CREATE),
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
