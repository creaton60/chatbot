package com.hello.chatbot.api.repository;

import com.hello.chatbot.api.domain.BotMenu;
import com.hello.chatbot.api.domain.Bots;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<BotMenu, Integer>{

    List<BotMenu> findByBotId(Bots bot);
}
