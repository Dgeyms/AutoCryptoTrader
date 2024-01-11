package com.example.autocryptotrader.model;

import org.springframework.stereotype.Component;

@Component
public class BotParams {
    private final String nameBot;
    private final TypeTradingDirection typeTradingDirection; // направление торговли
    private final String tokenPair;
    private final int creditLeverage;
    private final double percentTakeProfit;
    private final double dollarOrderVolume;


    public enum TypeTradingDirection{
        LONG, SHORT
    }

    public String getNameBot() {
        return nameBot;
    }

    public TypeTradingDirection getTypeTradingDirection() {
        return typeTradingDirection;
    }

    public String getTokenPair() {
        return tokenPair;
    }

    public int getCreditLeverage() {
        return creditLeverage;
    }

    public double getPercentTakeProfit() {
        return percentTakeProfit;
    }

    public double getDollarOrderVolume() {
        return dollarOrderVolume;
    }
}
