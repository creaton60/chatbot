package com.hello.chatbot.api.repository;

import com.hello.chatbot.api.domain.BotActionsDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionDetailRepository extends JpaRepository<BotActionsDetail, Integer>{

}
