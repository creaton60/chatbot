package com.hello.chatbot.api.controller;

import com.hello.chatbot.api.service.CardService;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.hello.chatbot.api.constants.RequestURL.*;

@RestController
public class CardController {

    @Autowired
    private CardService cardService;

    @PostMapping(produces = "application/json", value = CHATBOT_CARD_CREATE)
    public ChatBotApiMessage createCards(@PathVariable int version,
                                         @Valid @RequestBody ChatBotClientMessage message){

        return cardService.createCard(message);
    }

    @GetMapping(produces = "application/json", value = CHATBOT_CARD_LIST)
    public ChatBotApiMessage getCardList(@PathVariable int version,
                                         @PathVariable int cardId){

        return cardService.getCardList(cardId);
    }

    @GetMapping(produces = "application/json", value = CHATBOT_CARD_INFO)
    public ChatBotApiMessage getCardInfo(@PathVariable int version,
                                         @PathVariable int cardId,
                                         @PathVariable int infoId){

        return cardService.getOneCardInfo(cardId, infoId);
    }


}
