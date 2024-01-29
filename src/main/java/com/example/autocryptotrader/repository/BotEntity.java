package com.example.autocryptotrader.repository;

import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Entity
public class BotEntity {
    @Id
    private Long id;
    private String nameBot;

}
