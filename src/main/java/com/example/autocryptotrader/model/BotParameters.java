package com.example.autocryptotrader.model;

import lombok.Data;
@Data
public class BotParameters {
    private final String nameBot;
    private final TypeTradingDirection typeTradingDirection; // направление торговли
    private final String tokenPair;
    private final int creditLeverage;
    private final double percentTakeProfit;
    private final double dollarOrderVolume;


    public enum TypeTradingDirection {
        LONG, SHORT
    }


}


