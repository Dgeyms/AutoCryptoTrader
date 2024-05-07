package com.example.autocryptotrader.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
@Data
public class BotDTO {
    @Pattern(regexp = "^[0-19]+$", message = "Must contain only digits")
    private Long clientId;

    @Pattern(regexp = "^[0-19]+$", message = "Must contain only digits")
    private Long botId;

    @NotBlank
    @Size(min = 3, message = "Name must be at least 3 characters long")
    private String nameBot;

    @NotBlank
    private String nameTokenPair;

    @NotBlank
    private String typeTradingDirection; // direction of trade

    private int timePeriod;

}
