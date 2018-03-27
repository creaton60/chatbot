package com.hello.chatbot.api.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "cb_actions_detail")
public class BotActionsDetail implements Serializable{
    @Id
    @Column(name = "detail_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int detailId;

    @ManyToMany(targetEntity = BotActions.class)
    @JoinColumn(name = "action_id", nullable = false)
    private BotActions action;

    @Column(name = "detail_context")
    private String context;

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    public BotActions getAction() {
        return action;
    }

    public void setAction(BotActions action) {
        this.action = action;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
