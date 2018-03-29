package com.hello.chatbot.api.bot;

import com.hello.chatbot.api.domain.BotEvents;
import com.hello.chatbot.api.domain.BotMenu;
import com.hello.chatbot.api.domain.Bots;
import com.hello.chatbot.api.service.*;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.action.ClientCreateActionMessage;
import com.hello.chatbot.common.client.bot.ClientCreateBotMessage;
import com.hello.chatbot.common.client.chat.ClientChatMessage;
import com.hello.chatbot.common.client.event.ClientCreateEventMessage;
import com.hello.chatbot.common.client.menu.ClientCreateMenuMessage;
import com.hello.chatbot.common.data.BillType;
import com.hello.chatbot.common.data.BotActionType;
import com.hello.chatbot.common.data.BotEventType;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ScenarioTest {

    @Autowired
    private BotService botService;

    @Autowired
    private MenuService menuService;

    @Autowired
    private EventService eventService;

    @Autowired
    private ActionService actionService;

    @Autowired
    private ChatService chatService;

    private String[][] himessage = {
            {"Hi" , "Hello"},
            {"Hi", "Hi"},
            {"What are you doing?", "just rest~"}
    };



    @Ignore
    @Test
    public void testCreateScenarioBot() {
        //TODO: create Chat Bot
        ClientCreateBotMessage bot = new ClientCreateBotMessage();
        bot.setBotName("Tester2");
        bot.setBotType("Test Bot");
        bot.setBotDesc("Test Bot 2 With Scenario");

        botService.createChatBot(bot);

        //TODO: select bot
        Bots bots = botService.getChatBotWithName("Tester2");

        //TODO: create Menu
        ClientCreateMenuMessage menu = new ClientCreateMenuMessage();
        menu.setBillType(BillType.FREE);
        menu.setMenuName("Test Menu");
        menu.setPrice(0);
        menu.setBotId(bots.getBotId());

        menuService.createMenu(menu);

        //TODO: create default Text
        ClientCreateEventMessage defaultEvent = new ClientCreateEventMessage();
        defaultEvent.setBotId(bots.getBotId());
        defaultEvent.setEventDesc("Test Default Text Event");
        defaultEvent.setEventName("Default Text");
        defaultEvent.setEventSeq(0);
        defaultEvent.setMenuId(0);
        defaultEvent.setEventType(BotEventType.TEXT);

        eventService.createEvent(defaultEvent);

        BotEvents event = eventService.getEventWithSelectOne(bots, BotEventType.TEXT, null, 0);

        List<ClientCreateActionMessage> list = doClientActionList(event.getId());


        System.out.println(list.size());

        //TODO: create Menu Scenario menu -> close

        //TODO: open leave Scenario



    }

    @Ignore
    @Test
    public void testCreateAction(){
        Bots bots = botService.getChatBotWithName("Tester2");


        BotEvents event = eventService.getEventWithSelectOne(bots, BotEventType.TEXT, null, 0);

        List<ClientCreateActionMessage> list = doClientActionList(event.getId());

        for(ClientCreateActionMessage message :  list){
            actionService.createAction(message);
        }
    }

    @Ignore
    @Test
    public void testCreateOpenEvent(){

        Bots bots = botService.getChatBotWithName("Tester2");

        ClientCreateEventMessage defaultEvent = new ClientCreateEventMessage();
        defaultEvent.setBotId(bots.getBotId());
        defaultEvent.setEventDesc("Test Default open Event");
        defaultEvent.setEventName("test chatbot Open");
        defaultEvent.setEventSeq(0);
        defaultEvent.setMenuId(0);
        defaultEvent.setEventType(BotEventType.OPEN);

        eventService.createEvent(defaultEvent);
    }

    @Ignore
    @Test
    public void testCreateButtonEvent() {
        Bots bots = botService.getChatBotWithName("Tester2");

        ClientCreateEventMessage defaultEvent = new ClientCreateEventMessage();
        defaultEvent.setBotId(bots.getBotId());
        defaultEvent.setEventDesc("Test Default Button Event");
        defaultEvent.setEventName("test chatbot Button");
        defaultEvent.setEventSeq(0);
        defaultEvent.setMenuId(0);
        defaultEvent.setEventType(BotEventType.BUTTON);

        eventService.createEvent(defaultEvent);
    }

    @Ignore
    @Test
    public void testCreateLeaveEvent(){
        Bots bots = botService.getChatBotWithName("Tester2");

        ClientCreateEventMessage defaultEvent = new ClientCreateEventMessage();
        defaultEvent.setBotId(bots.getBotId());
        defaultEvent.setEventDesc("Test Default Leave Event");
        defaultEvent.setEventName("test chatbot Button");
        defaultEvent.setEventSeq(0);
        defaultEvent.setMenuId(0);
        defaultEvent.setEventType(BotEventType.LEAVE);

        eventService.createEvent(defaultEvent);

    }

    @Ignore
    @Test
    public void testCreateCardEvent(){
        Bots bots = botService.getChatBotWithName("Tester2");

        ClientCreateEventMessage defaultEvent = new ClientCreateEventMessage();
        defaultEvent.setBotId(bots.getBotId());
        defaultEvent.setEventDesc("Test Default Card Event");
        defaultEvent.setEventName("test chatbot Card");
        defaultEvent.setEventSeq(0);
        defaultEvent.setMenuId(0);
        defaultEvent.setEventType(BotEventType.CARD);

        eventService.createEvent(defaultEvent);
    }

    @Ignore
    @Test
    public void testCreateMenuEvent(){
        Bots bots = botService.getChatBotWithName("Tester2");

        ClientCreateEventMessage defaultEvent = new ClientCreateEventMessage();
        defaultEvent.setBotId(bots.getBotId());
        defaultEvent.setEventDesc("Test Default Menu Event");
        defaultEvent.setEventName("test chatbot Menu");
        defaultEvent.setEventSeq(1);
        defaultEvent.setMenuId(4);
        defaultEvent.setEventType(BotEventType.MENU);

        eventService.createEvent(defaultEvent);

    }


    private List<ClientCreateActionMessage> doClientActionList(int eventId){
        List<ClientCreateActionMessage> list = new ArrayList<>();

        for(int i=0; i < himessage.length; i++){
            ClientCreateActionMessage message = new ClientCreateActionMessage();
            message.setActionName(himessage[i][0]);
            message.setContext(himessage[i][1]);
            message.setActionType(BotActionType.TEXT);
            message.setEventId(eventId);

            list.add(message);
        }

        return list;

    }

    @Test
    public void testExecScenario(){
        ClientChatMessage message = new ClientChatMessage();
        message.setBotId(3);
        message.setText("Hi");
        message.setEventSeq(0);
        message.setMenuId(0);
        message.setEventType(BotEventType.TEXT);

        System.out.println(chatService.processChatEvent(message));
    }

}
