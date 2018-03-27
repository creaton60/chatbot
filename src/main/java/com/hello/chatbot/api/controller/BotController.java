package com.hello.chatbot.api.controller;

import com.hello.chatbot.api.service.BotService;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.hello.chatbot.api.constants.RequestURL.*;

@RestController
public class BotController {

    @Autowired
    private BotService botService;

    @PostMapping(produces = "application/json", value = CHATBOT_BOT_CREATE)
    public ChatBotApiMessage createChatBot(@PathVariable int version,
                                           @Valid @RequestBody ChatBotClientMessage message){

        return botService.createChatBot(message);
    }

    @PutMapping(produces = "application/json", value = CHATBOT_BOT_MODIFY)
    public ChatBotApiMessage updateChatBot(@PathVariable int version,
                                           @Valid @RequestBody ChatBotClientMessage message){

        return botService.updateChatBot(message);
    }

    @GetMapping(produces = "application/json", value = CHATBOT_BOT_INFO)
    public ChatBotApiMessage getChatBotInfo(@PathVariable int version,
                                            @PathVariable int botId){

        return botService.getChatBotInfo(botId);
    }

    @GetMapping(produces = "application/json", value = CHATBOT_BOT_LIST)
    public ChatBotApiMessage getChatBotList(@PathVariable int version){
        return botService.getChatBotList();
    }

    @DeleteMapping(produces = "application/json", value = CHATBOT_BOT_WITHDRAW)
    public ChatBotApiMessage withDrawChatBot(@PathVariable int version,
                                             @PathVariable int botId){

        return botService.withDrawChatBot(botId);
    }

}
