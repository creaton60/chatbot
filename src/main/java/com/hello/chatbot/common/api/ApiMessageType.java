package com.hello.chatbot.common.api;

public enum ApiMessageType {
    MESSAGE_BOT_CREATE(ApiValues.VALUE_BOT_CREATE),
    MESSAGE_BOT_MODIFY(ApiValues.VALUE_BOT_MODIFY),
    MESSAGE_BOT_INFO(ApiValues.VALUE_BOT_INFO),
    MESSAGE_BOT_LIST(ApiValues.VALUE_BOT_LIST),
    MESSAGE_BOT_WITHDRAW(ApiValues.VALUE_BOT_WITHDRAW),
    MESSAGE_EVENT_CREATE(ApiValues.VALUE_EVENT_CREATE),
    MESSAGE_EVENT_MODIFY(ApiValues.VALUE_EVENT_MODIFY),
    MESSAGE_EVENT_MENU(ApiValues.VALUE_EVENT_MENU),
    MESSAGE_ACTION_CREATE(ApiValues.VALUE_ACTION_CREATE),
    MESSAGE_ACTION_MODIFY(ApiValues.VALUE_ACTION_MODIFY),
    MESSAGE_CARDS_CREATE(ApiValues.VALUE_CARDS_CREATE),
    MESSAGE_CARDS_CREATE_DETAIL(ApiValues.VALUE_CARDS_CREATE_DETAIL),
    MESSAGE_CARDS_INFO(ApiValues.VALUE_CARDS_INFO),
    MESSAGE_CARDS_LIST(ApiValues.VALUE_CARDS_LIST),
    MESSAGE_CHAT_REACTION(ApiValues.VALUE_CHAT_REACTION),
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
        public static final String VALUE_BOT_MODIFY= "modifyChatBot";
        public static final String VALUE_BOT_INFO="chatBotInfo";
        public static final String VALUE_BOT_LIST="chatBotList";
        public static final String VALUE_BOT_WITHDRAW="chatBotWithDraw";
        public static final String VALUE_EVENT_CREATE="createEvent";
        public static final String VALUE_EVENT_MODIFY="modifyEvent";
        public static final String VALUE_EVENT_MENU="eventMenuList";
        public static final String VALUE_ACTION_CREATE="createAction";
        public static final String VALUE_ACTION_MODIFY="modifyAction";
        public static final String VALUE_CARDS_CREATE="createCards";
        public static final String VALUE_CARDS_CREATE_DETAIL="createCardDetail";
        public static final String VALUE_CARDS_INFO="cardInfo";
        public static final String VALUE_CARDS_LIST="cardList";
        public static final String VALUE_CHAT_REACTION="chatReaction";
        public static final String VALUE_ERROR="error";
    }
}
