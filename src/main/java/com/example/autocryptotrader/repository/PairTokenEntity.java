package com.example.autocryptotrader.repository;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class PairTokenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    private List<String> pairTokenList;
}
