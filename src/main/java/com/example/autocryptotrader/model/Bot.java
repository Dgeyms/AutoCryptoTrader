package com.example.autocryptotrader.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
public class Bot {
    private String nameBot;
    private List<BotParameters> botParametersList;

    public Bot(String nameBot) {
        this.nameBot = nameBot;
    }
}
