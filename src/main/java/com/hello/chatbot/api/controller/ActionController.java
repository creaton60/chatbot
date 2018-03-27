package com.hello.chatbot.api.controller;

import com.hello.chatbot.api.service.ActionService;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.hello.chatbot.api.constants.RequestURL.CHATBOT_ACTION_CREATE;
import static com.hello.chatbot.api.constants.RequestURL.CHATBOT_ACTION_MODIFY;

@RestController
public class ActionController {

    @Autowired
    private ActionService actionService;

    @PostMapping(produces = "application/json", value = CHATBOT_ACTION_CREATE)
    public ChatBotApiMessage createChatBot(@PathVariable("version") int version,
                                           @Valid @RequestBody ChatBotClientMessage message){

        return actionService.createAction(message);
    }

    @PutMapping(produces = "application/json", value = CHATBOT_ACTION_MODIFY)
    public ChatBotApiMessage updateChatBot(@PathVariable("version") int version,
                                           @Valid @RequestBody ChatBotClientMessage message){

        return actionService.updateAction(message);
    }
}
