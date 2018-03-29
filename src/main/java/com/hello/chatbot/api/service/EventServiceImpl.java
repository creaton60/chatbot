package com.hello.chatbot.api.service;

import com.hello.chatbot.api.domain.*;
import com.hello.chatbot.api.repository.EventRepository;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.api.builder.event.ApiCreateEventMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.event.ClientCreateEventMessage;
import com.hello.chatbot.common.data.BotEventType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Random;


@Service
public class EventServiceImpl implements EventService{

    @Autowired
    private BotService botService;

    @Autowired
    private MenuService menuService;

    @Autowired
    private EventRepository eventRepository;

    @Transactional
    @Override
    public ChatBotApiMessage createEvent(ChatBotClientMessage message) {

        if(message instanceof ClientCreateEventMessage){

            ClientCreateEventMessage eventMsg = (ClientCreateEventMessage)message;

            Bots bot = botService.getChatBot(eventMsg.getBotId());

            BotMenu menu = menuService.getMenu(eventMsg.getMenuId());


            BotEvents event = new BotEvents();
            event.setBot(bot);
            event.setEventDesc(eventMsg.getEventDesc());
            event.setEventName(eventMsg.getEventName());
            event.setEventSeq(eventMsg.getEventSeq());
            event.setMenu(menu);
            event.setRegDate(new Date());
            event.setEventType(eventMsg.getEventType());

            eventRepository.save(event);

            ApiCreateEventMessage msg = new ApiCreateEventMessage();
            msg.setStatus(HttpStatus.OK);

            return msg;
        }else{
            //TODO: APi Error Code BAD REQUEST

            return null;
        }
    }

    @Transactional
    @Override
    public ChatBotApiMessage modifyEvent(ChatBotClientMessage message) {
        return null;
    }

    @Override
    public BotEvents getEvent(int eventId) {
        BotEvents event = eventRepository.findOne(eventId);

        return event;

    }

    @Override
    public BotEvents getEventWithChatSeq(Bots bot, BotMenu menu, int eventSeq) {

        List<BotEvents> events = eventRepository.findByBotAndMenuAndEventSeq(bot, menu, eventSeq);


        return events.get(0);
    }

    @Override
    public BotEvents getEventWithButton(Bots bot, BotMenu menu, int eventSeq, BotButtons button) {

        List<BotEvents> events = eventRepository.findByBotAndMenuAndEventSeqAndButton(bot, menu, eventSeq, button);

        return events.get(0);
    }

    @Override
    public BotEvents getEventWithCard(Bots bot, BotMenu menu, int eventSeq, BotCards card) {

        List<BotEvents> events = eventRepository.findByBotAndMenuAndEventSeqAndCard(bot, menu, eventSeq, card);

        return events.get(0);
    }

    @Override
    public BotEvents getEventWithType(Bots bot, BotEventType type) {

        List<BotEvents> events = eventRepository.findByBotAndEventType(bot, type);

        return events.get(0);
    }

    @Override
    public BotEvents getEventWithSelectOne(Bots bot, BotEventType type, BotMenu menu, int eventSeq) {

        List<BotEvents> events = eventRepository.findByBotAndEventTypeAndEventSeqAndMenu(bot, type, eventSeq,menu);

        Random rand = new Random();

        int size = events.size();

        System.out.println(size);

        int index = rand.nextInt(size);

        return events.get(index);
    }

}
