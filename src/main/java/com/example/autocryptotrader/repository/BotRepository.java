package com.example.autocryptotrader.repository;

import com.example.autocryptotrader.model.Bot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BotRepository extends JpaRepository<Bot, Long> {


    void saveBotNameInDatabase(String botName);


    boolean existsBotNameInDatabase(Long id);
}

