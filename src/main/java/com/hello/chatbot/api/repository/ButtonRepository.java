package com.hello.chatbot.api.repository;

import com.hello.chatbot.api.domain.BotButtons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ButtonRepository extends JpaRepository<BotButtons, Integer>{
}
