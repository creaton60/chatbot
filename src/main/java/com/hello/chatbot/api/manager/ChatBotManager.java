package com.hello.chatbot.api.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ChatBotManager {
    private final Logger LOG = LoggerFactory.getLogger(ChatBotManager.class);


    @PostConstruct
    public void initializeChatBot(){
        LOG.info("Initialize Chat Bot");
    }

}
