package com.hello.chatbot.api.controller;

import com.hello.chatbot.api.service.EventService;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.hello.chatbot.api.constants.RequestURL.*;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping(produces = "application/json", value = CHATBOT_EVENT_CREATE)
    public ChatBotApiMessage createEvent(@PathVariable int version,
                                         @Valid @RequestBody ChatBotClientMessage message){

        return eventService.createEvent(message);
    }

    @PutMapping(produces = "application/json", value = CHATBOT_EVENT_MODIFY)
    public ChatBotApiMessage updateEvent(@PathVariable int version,
                                         @Valid @RequestBody ChatBotClientMessage message){

        return eventService.modifyEvent(message);
    }

    @GetMapping(produces = "application/json", value = CHATBOT_EVENT_MENU)
    public ChatBotApiMessage getChatBotMenuList(@PathVariable int version,
                                                @PathVariable int botId){

        return eventService.getMenuList(botId);
    }



}
