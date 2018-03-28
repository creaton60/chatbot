package com.hello.chatbot.api.controller;

import com.hello.chatbot.api.service.MenuService;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.hello.chatbot.api.constants.RequestURL.*;

@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    @PostMapping(produces = "application/json", value = CHATBOT_MENU_CREATE)
    public ChatBotApiMessage createMenu(@PathVariable int version,
                                        @Valid @RequestBody ChatBotClientMessage message){

        return null;
    }

    @PutMapping(produces = "application/json", value = CHATBOT_MENU_MODIFY)
    public ChatBotApiMessage updateMenu(@PathVariable int version,
                                        @Valid @RequestBody ChatBotClientMessage message){
        return null;
    }

    @GetMapping(produces = "application/json", value = CHATBOT_MENU_LIST)
    public ChatBotApiMessage getMenuList(@PathVariable int version){

        return null;
    }

    @GetMapping(produces = "application/json", value = CHATBOT_MENU_INFO)
    public ChatBotApiMessage getMenuInfo(@PathVariable int version,
                                         @PathVariable int botId){
        return null;
    }

    @DeleteMapping(produces = "application/json", value = CHATBOT_MENU_DELETE)
    public ChatBotApiMessage deleteMenu(@PathVariable int version,
                                        @PathVariable int botId){
        return null;
    }

}
