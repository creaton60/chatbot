package com.hello.chatbot.api.service;

import com.hello.chatbot.api.domain.*;
import com.hello.chatbot.api.repository.ActionRepository;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.api.chat.ApiChatInfoMessage;
import com.hello.chatbot.common.api.chat.ApiChatReactionMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.chat.ClientChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
public class ChatServiceImpl implements ChatService{

    @Autowired
    private BotService botService;

    @Autowired
    private EventService eventService;

    @Autowired
    private MenuService menuService;

    @Autowired
    private ActionService actionService;

    @Autowired
    private ButtonService buttonService;

    @Autowired
    private CardService cardService;


    @Transactional
    @Override
    public ChatBotApiMessage processChatEvent(ChatBotClientMessage message) {
        if(message instanceof ClientChatMessage){
            //TODO: Select Event with botId, eventSeq, menuId, buttonId, cardId

            ClientChatMessage chatMsg = (ClientChatMessage) message;

            Bots bot = botService.getChatBot(chatMsg.getBotId());

            BotMenu menu = menuService.getMenu(chatMsg.getMenuId());

            BotCards card = cardService.getCard(chatMsg.getCardId());

            BotButtons button = buttonService.getButton(chatMsg.getButtonId());


            BotEvents event;


            if(chatMsg.getMenuId() > 0){
                switch(chatMsg.getEventType()){
                    case TEXT:
                        event = eventService.getEventWithChatSeq(bot, menu, chatMsg.getEventSeq());
                        break;
                    case MENU:
                        event = eventService.getEventWithChatSeq(bot, menu, chatMsg.getEventSeq());
                        break;
                    case CARD:
                        event = eventService.getEventWithCard(bot, menu, chatMsg.getEventSeq(), card);
                        break;
                    case LEAVE:
                        event = eventService.getEventWithType(bot, chatMsg.getEventType());
                        break;
                    case BUTTON:
                        event = eventService.getEventWithButton(bot, menu, chatMsg.getEventSeq(), button);
                        break;
                    case OPEN:
                        event = eventService.getEventWithType(bot, chatMsg.getEventType());
                        break;
                    default:
                        event = eventService.getEventWithChatSeq(bot, menu, chatMsg.getEventSeq());
                        break;
                }
            }else{
                event = eventService.getEventWithSelectOne(bot, chatMsg.getEventType(), menu, chatMsg.getEventSeq());
            }


            //TODO: Event ref Action List Select
            List<BotActions> actionList = actionService.getActionList(event);

            ApiChatReactionMessage msg = new ApiChatReactionMessage();

            List<ApiChatInfoMessage> chatList = new ArrayList<>();

            //TODO: Server Send to Client message with Action List
            for(BotActions action: actionList){
                ApiChatInfoMessage info = new ApiChatInfoMessage();
                info.setActionId(action.getActionId());
                info.setActionContext(action.getContext());
                info.setActionType(action.getType());

                chatList.add(info);
            }

            msg.setStatus(HttpStatus.OK);
            msg.setBotId(chatMsg.getBotId());
            msg.setEventId(event.getId());
            msg.setEventSeq(chatMsg.getEventSeq());
            msg.setMenuId(chatMsg.getMenuId());
            msg.setReactionList(chatList);

            return msg;
        }else{
            //TODO: APi Error Code BAD REQUEST

            return null;
        }
    }
}
