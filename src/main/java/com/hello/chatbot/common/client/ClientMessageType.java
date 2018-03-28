package com.hello.chatbot.common.client;

import com.sun.deploy.util.SessionState;

public enum ClientMessageType {

    MESSAGE_BOT_CREATE(ClientValues.VALUE_NEW_BOT),
    MESSAGE_BOT_MODIFY(ClientValues.VALUE_BOT_MODIFY),
    MESSAGE_EVENT_CREATE(ClientValues.VALUE_EVENT_CREATE),
    MESSAGE_EVENT_MODIFY(ClientValues.VALUE_EVENT_MODIFY),
    MESSAGE_ACTION_CREATE(ClientValues.VALUE_ACTION_CREATE),
    MESSAGE_ACTION_MODIFY(ClientValues.VALUE_ACTION_MODIFY),
    MESSAGE_CARD_CREATE(ClientValues.VALUE_CARD_CREATE),
    MESSAGE_CARD_DETAIL_CREATE(ClientValues.VALUE_CARD_DETAIL_CREATE),
    MESSAGE_MENU_CREATE(ClientValues.VALUE_MENU_CREATE),
    MESSAGE_MENU_MODIFY(ClientValues.VALUE_MENU_MODIFY),
    MESSAGE_CHAT_EVENT(ClientValues.VALUE_CHAT_EVENT);

    private String type;

    ClientMessageType(String type){
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public static class ClientValues{
        public static final String VALUE_NEW_BOT="createNewBot";
        public static final String VALUE_BOT_MODIFY="modifyBot";
        public static final String VALUE_EVENT_CREATE="createEvent";
        public static final String VALUE_EVENT_MODIFY="modifyEvent";
        public static final String VALUE_ACTION_CREATE="createAction";
        public static final String VALUE_ACTION_MODIFY="modifyAction";
        public static final String VALUE_CARD_CREATE="createCard";
        public static final String VALUE_CARD_DETAIL_CREATE="createDetailCard";
        public static final String VALUE_MENU_CREATE="createMenu";
        public static final String VALUE_MENU_MODIFY="modifyMenu";
        public static final String VALUE_CHAT_EVENT="chatEvent";


    }

}
