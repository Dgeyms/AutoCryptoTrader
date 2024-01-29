package com.example.autocryptotrader.model;

import com.example.autocryptotrader.repository.TokenPairRepository;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class BotParameters {
    private Long id;
    private String nameBot;
    private List<String> tokenPair; // from database
    private TypeTradingDirection typeTradingDirection; // направление торговли
    private int creditLeverage;
    private double percentTakeProfit;
    private double dollarOrderVolume;

    public enum TypeTradingDirection {
        LONG, SHORT
    }
    public BotParameters(TokenPairRepository tokenPairRepository) {
        this.tokenPair = tokenPairRepository.getTokenPairFromDatabase();
    }
}


