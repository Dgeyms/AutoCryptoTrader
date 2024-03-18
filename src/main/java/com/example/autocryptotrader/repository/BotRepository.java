package com.example.autocryptotrader.repository;

import com.example.autocryptotrader.model.Bot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BotRepository extends JpaRepository<Bot, Long> {


    boolean existsBotNameInDatabase(Long id);
}

