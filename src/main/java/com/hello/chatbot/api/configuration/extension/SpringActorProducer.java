package com.hello.chatbot.api.configuration.extension;

import akka.actor.Actor;
import akka.actor.IndirectActorProducer;
import org.springframework.context.ApplicationContext;

public class SpringActorProducer implements IndirectActorProducer{
    private final ApplicationContext applicationContext;
    private final String actorBeanName;

    public SpringActorProducer(ApplicationContext context, String actorBeanName) {
        this.applicationContext = context;
        this.actorBeanName = actorBeanName;
    }

    @Override
    public Actor produce() {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<? extends Actor> actorClass() {
        return (Class<? extends Actor>) applicationContext.getType(actorBeanName);
    }
}
