package com.example.autocryptotrader.repository;

import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
@Entity
public class BotEntity {
    @Id
    private Long id;
    private String nameBot;

}
