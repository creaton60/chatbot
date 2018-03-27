package com.hello.chatbot.common.api;

public enum ApiMessageType {
    MESSAGE_BOT_CREATE(ApiValues.VALUE_BOT_CREATE),
    MESSAGE_ERROR(ApiValues.VALUE_ERROR);

    private String type;

    ApiMessageType(String type){
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public static class ApiValues{
        public static final String VALUE_BOT_CREATE= "createNewBot";
        public static final String VALUE_ERROR="error";
    }
}
