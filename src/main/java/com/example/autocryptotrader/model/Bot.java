package com.example.autocryptotrader.model;

import lombok.Data;

import java.util.List;
@Data
public class Bot {
    private Long id;
    private String nameBot;
    private List<String> nameTokenPair; // from database
    private TypeTradingDirection typeTradingDirection; // направление торговли
    private int creditLeverage;
    private double percentTakeProfit;
    private double dollarOrderVolume;

    public enum TypeTradingDirection {
        LONG, SHORT
    }

    public Bot(String nameBot) {
        this.nameBot = nameBot;
    }
}
