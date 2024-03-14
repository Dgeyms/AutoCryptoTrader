package com.example.autocryptotrader.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;
@Data
@Entity(name = "bots")
public class Bot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

}
