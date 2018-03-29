package com.hello.chatbot.api.service;

import com.hello.chatbot.api.domain.BotMenu;
import com.hello.chatbot.api.domain.Bots;
import com.hello.chatbot.api.repository.MenuRepository;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.api.builder.menu.ApiMenuCreateMessage;
import com.hello.chatbot.common.api.builder.menu.ApiMenuInfoMessage;
import com.hello.chatbot.common.api.builder.menu.ApiMenuListMessage;
import com.hello.chatbot.common.api.builder.menu.ApiMenuModifyMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.menu.ClientCreateMenuMessage;
import com.hello.chatbot.common.client.menu.ClientModifyMenuMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private BotService botService;

    @Transactional
    @Override
    public ChatBotApiMessage createMenu(ChatBotClientMessage message) {

        if(message instanceof ClientCreateMenuMessage){

            ClientCreateMenuMessage createMenuMsg = (ClientCreateMenuMessage)message;

            Bots bot = botService.getChatBot(createMenuMsg.getBotId());

            BotMenu menu = new BotMenu();
            menu.setBillType(createMenuMsg.getBillType());
            menu.setBotId(bot);
            menu.setMenuName(createMenuMsg.getMenuName());
            menu.setPrice(createMenuMsg.getPrice());

            menuRepository.save(menu);

            ApiMenuCreateMessage msg = new ApiMenuCreateMessage();
            msg.setStatus(HttpStatus.OK);

            return msg;
        }else{
            //TODO: Api Error Code BAD REQUEST

            return null;
        }
    }

    @Transactional
    @Override
    public ChatBotApiMessage updateMenu(ChatBotClientMessage message) {
        if(message instanceof ClientModifyMenuMessage){

            ClientModifyMenuMessage modifyMenuMsg = (ClientModifyMenuMessage)message;

            BotMenu menu = menuRepository.findOne(modifyMenuMsg.getMenuId());

            menu.setBillType(modifyMenuMsg.getBillType());
            menu.setMenuName(modifyMenuMsg.getMenuName());
            menu.setPrice(modifyMenuMsg.getPrice());

            menuRepository.save(menu);

            ApiMenuModifyMessage msg = new ApiMenuModifyMessage();
            msg.setStatus(HttpStatus.OK);

            return msg;
        }else{
            //TODO: Api Error Code BAD REQUEST

            return null;
        }
    }

    @Override
    public ChatBotApiMessage getMenuInfo(int menuId) {

        BotMenu menu = menuRepository.findOne(menuId);

        if(menu != null){
            ApiMenuInfoMessage msg = new ApiMenuInfoMessage();
            msg.setBillType(menu.getBillType());
            msg.setBotId(menu.getBotId().getBotId());
            msg.setMenuId(menu.getMenuId());
            msg.setMenuName(menu.getMenuName());

            return msg;
        }else{
            //TODO: Api Error Code NOT EXIST

            return null;
        }
    }

    @Override
    public ChatBotApiMessage getMenuList(int botId) {

        Bots bot = botService.getChatBot(botId);

        if(bot != null){

            List<BotMenu> menuList = menuRepository.findByBotId(bot);

            if(menuList.size() > 0){
                ApiMenuListMessage msg= new ApiMenuListMessage();

                List<ApiMenuInfoMessage> list =new ArrayList<>();

                for(BotMenu menu : menuList){
                    ApiMenuInfoMessage info = new ApiMenuInfoMessage();

                    info.setMenuName(menu.getMenuName());
                    info.setMenuId(menu.getMenuId());
                    info.setBotId(botId);
                    info.setBillType(menu.getBillType());
                    info.setPrice(menu.getPrice());

                    list.add(info);
                }

                msg.setStatus(HttpStatus.OK);
                msg.setBotId(botId);
                msg.setMenuList(list);

                return msg;
            }else{
                //TODO Api Error Code NOT EXIST

                return null;
            }
        }else{
            //TODO: Api Error Code NOT EXIST

            return null;
        }

    }

    @Override
    public BotMenu getMenu(int menuId) {
        BotMenu menu = menuRepository.findOne(menuId);

        return menu;
    }

    @Override
    public ChatBotApiMessage deleteMenu(int menuId) {
        return null;
    }
}
