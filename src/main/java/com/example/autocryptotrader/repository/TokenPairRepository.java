package com.example.autocryptotrader.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface TokenPairRepository extends JpaRepository<PairTokenEntity, Long> {
    List<String> getTokenPairFromDatabase();
}
