package com.example.autocryptotrader.repository;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class PairTokenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_token_pair")
    private String nameTokenPair;
}
