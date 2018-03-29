package com.hello.chatbot.api.service;

import com.hello.chatbot.common.client.bot.ClientCreateBotMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BotServiceTest {

    @Autowired
    private BotService botService;

    @Test
    public void testCreateNewBot(){

        ClientCreateBotMessage message = new ClientCreateBotMessage();

        message.setBotName("Test");
        message.setBotType("TestBot");
        message.setBotDesc("Just Test Bot");

        botService.createChatBot(message);
    }

}
