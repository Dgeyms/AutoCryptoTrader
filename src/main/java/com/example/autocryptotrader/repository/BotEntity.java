package com.example.autocryptotrader.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bots")
public class BotEntity {
    @Id
    private String id;
    private String nameBot;
    private String tradingDirection; // направление торговли
    private String tokenPair;
    private int creditLeverage;
    private double percentTakeProfit;
    private double dollarOrderVolume;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameBot() {
        return nameBot;
    }

    public void setNameBot(String nameBot) {
        this.nameBot = nameBot;
    }

    public String getTradingDirection() {
        return tradingDirection;
    }

    public void setTradingDirection(String tradingDirection) {
        this.tradingDirection = tradingDirection;
    }

    public String getTokenPair() {
        return tokenPair;
    }

    public void setTokenPair(String tokenPair) {
        this.tokenPair = tokenPair;
    }

    public int getCreditLeverage() {
        return creditLeverage;
    }

    public void setCreditLeverage(int creditLeverage) {
        this.creditLeverage = creditLeverage;
    }

    public double getPercentTakeProfit() {
        return percentTakeProfit;
    }

    public void setPercentTakeProfit(double percentTakeProfit) {
        this.percentTakeProfit = percentTakeProfit;
    }

    public double getDollarOrderVolume() {
        return dollarOrderVolume;
    }

    public void setDollarOrderVolume(double dollarOrderVolume) {
        this.dollarOrderVolume = dollarOrderVolume;
    }
}
