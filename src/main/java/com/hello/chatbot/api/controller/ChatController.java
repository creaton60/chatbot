package com.hello.chatbot.api.controller;

import com.hello.chatbot.api.service.ChatService;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.hello.chatbot.api.constants.RequestURL.CHATBOT_CHAT_EVENT;

/**
 * This controller is used to client request reaction
 *
 * This controller return message format is only ChatBotApiMessage {@link ChatBotApiMessage}
 *
 * @author creaton60
 */
@RestController
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PutMapping(produces = "application/json", value = CHATBOT_CHAT_EVENT)
    public ChatBotApiMessage processChatEvent(@PathVariable int version,
                                              @Valid @RequestBody ChatBotClientMessage message){
        return chatService.processChatEvent(message);
    }
}
