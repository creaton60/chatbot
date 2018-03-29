package com.hello.chatbot.api.repository;

import com.hello.chatbot.api.domain.BotActions;
import com.hello.chatbot.api.domain.BotEvents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActionRepository extends JpaRepository<BotActions, Integer>{

    List<BotActions> findByEvent(BotEvents event);

}
