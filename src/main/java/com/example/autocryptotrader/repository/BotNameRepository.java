package com.example.autocryptotrader.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotNameRepository extends JpaRepository<BotEntity, Long> {

    BotEntity save (String botName);

}
