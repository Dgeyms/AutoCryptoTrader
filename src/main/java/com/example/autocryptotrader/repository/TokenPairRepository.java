package com.example.autocryptotrader.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TokenPairRepository extends JpaRepository<PairTokenEntity, Long> {

    // Если вам нужны только имена токенов
    @Query("SELECT t.nameTokenPair FROM PairTokenEntity t")
    List<String> findAllTokenNames();

}
