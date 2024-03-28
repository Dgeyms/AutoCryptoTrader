package com.example.autocryptotrader.repository;

import com.example.autocryptotrader.model.BotDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BotRepository extends JpaRepository<BotEntity, Long> {

    boolean existsBotNameInDatabase(Long id, String nameBot, String typeTradingDirection);

}

