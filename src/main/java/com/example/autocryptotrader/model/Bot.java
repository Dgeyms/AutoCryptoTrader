package com.example.autocryptotrader.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;
@Data
@Entity(name = "bots")
public class Bot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
