package com.example.autocryptotrader.repository;

import com.example.autocryptotrader.model.BotParameters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BotNameRepository extends JpaRepository<BotEntity, Long> {

    BotEntity save (String botName);

}
