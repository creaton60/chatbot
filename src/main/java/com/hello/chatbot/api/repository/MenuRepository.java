package com.hello.chatbot.api.repository;

import com.hello.chatbot.api.domain.BotMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<BotMenu, Integer>{
}
