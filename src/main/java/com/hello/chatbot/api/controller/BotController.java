package com.hello.chatbot.api.controller;

import com.hello.chatbot.api.service.BotService;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.hello.chatbot.api.constants.RequestURL.*;

/**
 * This class is api controller for chatbot basic control
 * This controller main service is BotService {@link BotService}
 * And Return Message Format Just Only ChatBotApiMessage
 *
 * @author creaton60
 */
@RestController
public class BotController {
    private final Logger LOG = LoggerFactory.getLogger(BotController.class);

    @Autowired
    private BotService botService;

    @PostMapping(produces = "application/json", value = CHATBOT_BOT_CREATE)
    public ChatBotApiMessage createChatBot(@PathVariable int version,
                                           @Valid @RequestBody ChatBotClientMessage message){

        return botService.createChatBot(message);
    }

    @PutMapping(produces = "application/json", value = CHATBOT_BOT_MODIFY)
    public ChatBotApiMessage updateChatBot(@PathVariable int version,
                                           @PathVariable int botId,
                                           @Valid @RequestBody ChatBotClientMessage message){

        LOG.info("Version : {} , botId : {} ", version, botId);

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
