package com.hello.chatbot.api.repository;

import com.hello.chatbot.api.domain.Bots;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotsRepository extends JpaRepository<Bots, Integer>{

}
