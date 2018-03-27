package com.hello.chatbot.api.repository;

import com.hello.chatbot.api.domain.BotActions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepository extends JpaRepository<BotActions, Integer>{
}
