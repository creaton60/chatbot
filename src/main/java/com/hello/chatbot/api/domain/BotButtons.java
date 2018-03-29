package com.hello.chatbot.api.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "CB_Buttons")
public class BotButtons implements Serializable{

    @Id
    @Column(name = "button_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int btnId;

    @Column(name = "button_name")
    private String btnName;

    public int getBtnId() {
        return btnId;
    }

    public void setBtnId(int btnId) {
        this.btnId = btnId;
    }

    public String getBtnName() {
        return btnName;
    }

    public void setBtnName(String btnName) {
        this.btnName = btnName;
    }
}
