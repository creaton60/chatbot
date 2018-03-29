package com.hello.chatbot.api.service;

import com.hello.chatbot.api.domain.Bots;
import com.hello.chatbot.api.repository.BotsRepository;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.api.builder.*;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.bot.ClientCreateBotMessage;
import com.hello.chatbot.common.client.bot.ClientModifyBotMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BotServiceImpl implements BotService{

    @Autowired
    private BotsRepository botRepository;

    @Transactional
    @Override
    public ChatBotApiMessage createChatBot(ChatBotClientMessage message) {
        if(message instanceof ClientCreateBotMessage){

            ClientCreateBotMessage createMsg = (ClientCreateBotMessage)message;

            Bots bot = new Bots();

            bot.setBotName(createMsg.getBotName());
            bot.setDesc(createMsg.getBotDesc());
            bot.setRegDate(new Date());
            bot.setBotType(createMsg.getBotType());

            botRepository.save(bot);

            ApiBotCreateMessage msg = new ApiBotCreateMessage();
            msg.setStatus(HttpStatus.OK);

            return msg;
        }else{
            //TODO: APiError Code
            return null;
        }
    }

    @Transactional
    @Override
    public ChatBotApiMessage updateChatBot(ChatBotClientMessage message) {
        if(message instanceof ClientModifyBotMessage){
            ClientModifyBotMessage modifyMsg = (ClientModifyBotMessage)message;

            Bots bot = botRepository.findOne(modifyMsg.getBotId());

            if(bot != null){
                bot.setBotName(modifyMsg.getBotName());
                bot.setBotType(modifyMsg.getBotType());
                bot.setDesc(modifyMsg.getBotDesc());

                botRepository.save(bot);

                ApiBotModifyMessage msg = new ApiBotModifyMessage();
                msg.setStatus(HttpStatus.OK);

                return msg;
            }else{
                //TODO: Api Error Code NOT EXIST

                return null;
            }
        }else{
            return null;
        }
    }

    @Override
    public ChatBotApiMessage getChatBotInfo(int botId) {
        Bots bot = botRepository.findOne(botId);

        if(bot !=null){
            ApiBotInfoMessage info = new ApiBotInfoMessage();
            info.setBotId(bot.getBotId());
            info.setBotName(bot.getBotName());
            info.setBotDesc(bot.getDesc());
            info.setBotType(bot.getBotType());
            info.setStatus(HttpStatus.OK);

            return info;
        }else{
            //TODO: Api error Code NOT EXIST

            return null;
        }

    }

    @Override
    public ChatBotApiMessage getChatBotList() {

        List<Bots> botList = botRepository.findAll();

        if(botList.size() > 0){
            ApiBotListMessage msg = new ApiBotListMessage();

            List<ApiBotInfoMessage> botInfos = new ArrayList<>();

            for(Bots bot : botList){
                ApiBotInfoMessage info = new ApiBotInfoMessage();
                info.setBotType(bot.getBotType());
                info.setBotDesc(bot.getDesc());
                info.setBotName(bot.getBotName());
                info.setBotId(bot.getBotId());

                botInfos.add(info);
            }

            msg.setStatus(HttpStatus.OK);
            msg.setBotList(botInfos);

            return msg;
        }else{

            //TODO: Api Error Code NOT EXIST
            return null;
        }
    }

    @Transactional
    @Override
    public ChatBotApiMessage withDrawChatBot(int botId) {
        Bots bot = botRepository.findOne(botId);

        if(bot != null){
            bot.setSubscription(1);

            botRepository.save(bot);

            ApiBotWithDrawMessage msg = new ApiBotWithDrawMessage();
            msg.setStatus(HttpStatus.OK);

            return msg;

        }else{
            //TODO: APi Error Code NOT EXIST

            return null;
        }

    }

    @Override
    public Bots getChatBot(int botId) {
        Bots bot = botRepository.findOne(botId);

        return bot;
    }

    @Override
    public Bots getChatBotWithName(String botName) {
        List<Bots> bot = botRepository.findByBotName(botName);

        return bot.get(0);
    }
}
