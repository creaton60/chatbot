package com.hello.chatbot.api.service;

import com.hello.chatbot.api.domain.BotButtons;
import com.hello.chatbot.api.repository.ButtonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ButtonServiceImpl implements ButtonService{

    @Autowired
    private ButtonRepository buttonRepository;

    @Override
    public BotButtons getButton(int buttonId) {

        BotButtons button = buttonRepository.findOne(buttonId);

        return button;

    }
}
