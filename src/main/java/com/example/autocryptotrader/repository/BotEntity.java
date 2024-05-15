package com.example.autocryptotrader.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity(name = "bots")
public class BotEntity {

    public BotEntity(BotDTO botDTO) {
        this.nameBot = botDTO.getNameBot();
        this.nameTokenPair = botDTO.getNameTokenPair();
        this.typeTradingDirection = botDTO.getTypeTradingDirection();
        this.creditLeverage = botDTO.getCreditLeverage();
        this.percentTakeProfit = botDTO.getPercentTakeProfit();
        this.dollarOrderVolume = botDTO.getDollarOrderVolume();
        this.clientId = botDTO.getClientId();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long botId;

    @NotBlank
    @Size(min = 3, message = "Name must be at least 3 characters long")
    private String nameBot;

    @NotBlank
    private String nameTokenPair;

    @NotBlank
    private String typeTradingDirection; // direction of trade

    @Pattern(regexp = "^[0-9]+$", message = "Must contain only digits")
    private int creditLeverage;

    @Pattern(regexp = "^[0-9]+$", message = "Must contain only digits")
    private double percentTakeProfit; // profit for a deal

    @Pattern(regexp = "^[0-9]+$", message = "Must contain only digits")
    private double dollarOrderVolume;

    @Pattern(regexp = "^[0-9]+$", message = "Must contain only digits")
    private Long clientId;
}
