package com.hello.chatbot.api.constants;

public class RequestURL {
    public static final String CHATBOT_INDEX="/";

    //Bot Generate
    public static final String CHATBOT_BOT_CREATE="/api/{version}/bots"; //post
    public static final String CHATBOT_BOT_MODIFY="/api/{version}/bots/{botId}"; //put
    public static final String CHATBOT_BOT_INFO="/api/{version}/bots/{botId}"; //get
    public static final String CHATBOT_BOT_LIST="/api/{version}/bots"; //get
    public static final String CHATBOT_BOT_WITHDRAW="/api/{version}/bots/{botId}"; //delete

    //Event Generate
    public static final String CHATBOT_EVENT_CREATE="/api/{version}/events"; //post
    public static final String CHATBOT_EVENT_MODIFY="/api/{version}/events/{eventId}";  //put

    //Menu Generate
    public static final String CHATBOT_MENU_CREATE="/api/{version}/menu"; //post
    public static final String CHATBOT_MENU_MODIFY="/api/{version}/menu/{menuId}"; //put
    public static final String CHATBOT_MENU_INFO="/api/{version}/menu/{menuId}"; //get
    public static final String CHATBOT_MENU_LIST="/api/{version}/menu/list/{botId}"; //get
    public static final String CHATBOT_MENU_DELETE="/api/{version}/menu/{menuId}"; //delete

    //Action Generate
    public static final String CHATBOT_ACTION_CREATE="/api/{version}/actions"; //post
    public static final String CHATBOT_ACTION_MODIFY="/api/{version}/actions"; //put

    //Card Generate
    public static final String CHATBOT_CARD_CREATE="/api/{version}/cards"; //post
    public static final String CHATBOT_CARD_LIST="/api/{version}/cards/{cardId}"; //get
    public static final String CHATBOT_CARD_INFO="/api/{version}/cards/{cardId}/info/{infoId}"; //get

    //Chat Input
    public static final String CHATBOT_CHAT_EVENT="/api/{version}/chats"; //put

}
