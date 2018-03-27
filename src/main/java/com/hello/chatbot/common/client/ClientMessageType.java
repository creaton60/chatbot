package com.hello.chatbot.common.client;

public enum ClientMessageType {

    MESSAGE_NEW_BOT(ClientValues.VALUE_NEW_BOT);

    private String type;

    ClientMessageType(String type){
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public static class ClientValues{
        public static final String VALUE_NEW_BOT="createNewBot";
    }

}
