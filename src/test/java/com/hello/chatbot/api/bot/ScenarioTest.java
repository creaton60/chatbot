package com.hello.chatbot.api.bot;

import com.hello.chatbot.api.domain.BotEvents;
import com.hello.chatbot.api.domain.Bots;
import com.hello.chatbot.api.service.ActionService;
import com.hello.chatbot.api.service.BotService;
import com.hello.chatbot.api.service.EventService;
import com.hello.chatbot.api.service.MenuService;
import com.hello.chatbot.common.client.action.ClientCreateActionMessage;
import com.hello.chatbot.common.client.bot.ClientCreateBotMessage;
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

    private String[][] himessage = {
            {"안녕?" , "안녕하세요"},
            {"안녕", "안녕"},
            {"뭐해?", "그냥 쉬고 있어요~"}
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

    @Test
    public void testCreateAction(){
        Bots bots = botService.getChatBotWithName("Tester2");


        BotEvents event = eventService.getEventWithSelectOne(bots, BotEventType.TEXT, null, 0);

        List<ClientCreateActionMessage> list = doClientActionList(event.getId());


        System.out.println(list.size());
    }

    @Test
    public void testCreateOpenEvent(){

    }

    @Test
    public void testCreateLeaveEvent(){

    }

    @Test
    public void testCreateMenuEvent(){

    }


    private List<ClientCreateActionMessage> doClientActionList(int eventId){
        List<ClientCreateActionMessage> list = new ArrayList<>();

        for(int i=0; i < himessage.length; i++){
            ClientCreateActionMessage message = new ClientCreateActionMessage();
            message.setActionName(himessage[i][0]);
            message.setContext(himessage[i][1]);
            message.setActionType(BotActionType.TEXT);

            list.add(message);
        }

        return list;

    }

    @Test
    public void testExecScenario(){

    }

}
