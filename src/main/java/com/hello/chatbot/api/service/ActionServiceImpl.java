package com.hello.chatbot.api.service;

import com.hello.chatbot.api.domain.BotActions;
import com.hello.chatbot.api.domain.BotEvents;
import com.hello.chatbot.api.repository.ActionRepository;
import com.hello.chatbot.common.api.ChatBotApiMessage;
import com.hello.chatbot.common.api.builder.action.ApiCreateActionMessage;
import com.hello.chatbot.common.api.builder.action.ApiModifyActionMessage;
import com.hello.chatbot.common.client.ChatBotClientMessage;
import com.hello.chatbot.common.client.action.ClientCreateActionMessage;
import com.hello.chatbot.common.client.action.ClientModifyActionMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ActionServiceImpl implements ActionService{

    @Autowired
    private EventService eventService;

    @Autowired
    private ActionRepository actionRepository;

    /**
     * This method is used to create action by client request
     *
     * @param message {@link ClientCreateActionMessage}
     * @return {@link ChatBotApiMessage}
     */
    @Transactional
    @Override
    public ChatBotApiMessage createAction(ChatBotClientMessage message) {
        if(message instanceof ClientCreateActionMessage){

            ClientCreateActionMessage actionMsg = (ClientCreateActionMessage)message;

            BotEvents event = eventService.getEvent(actionMsg.getEventId());

            BotActions action = new BotActions();
            action.setActionName(actionMsg.getActionName());
            action.setEvent(event);
            action.setType(actionMsg.getActionType());

            actionRepository.save(action);

            ApiCreateActionMessage msg = new ApiCreateActionMessage();
            msg.setStatus(HttpStatus.OK);


            return msg;
        }else{
            //TODO: APi Error Code BAD REQUEST

            return null;
        }
    }


    /**
     * This method is used to update action by client request
     *
     * @param message {@link ClientModifyActionMessage}
     * @return {@link ChatBotApiMessage}
     */
    @Transactional
    @Override
    public ChatBotApiMessage updateAction(ChatBotClientMessage message) {
        if(message instanceof ClientModifyActionMessage){

            ClientModifyActionMessage modifyMsg = (ClientModifyActionMessage)message;

            BotActions action = actionRepository.findOne(modifyMsg.getActionId());

            if(action != null){
                action.setActionName(modifyMsg.getActionName());
                action.setContext(modifyMsg.getContext());

                actionRepository.save(action);

                ApiModifyActionMessage msg = new ApiModifyActionMessage();
                msg.setStatus(HttpStatus.OK);

                return msg;

            }else{
                //TODO: Api Error Code NOT EXIST

                return null;
            }

        }else{
            //TODO: Api Error Code BAD REQUEST

            return null;
        }
    }


    @Override
    public List<BotActions> getActionList(BotEvents event) {
        return actionRepository.findByEvent(event);
    }
}
