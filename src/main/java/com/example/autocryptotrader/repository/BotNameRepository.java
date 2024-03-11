package com.example.autocryptotrader.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BotNameRepository {
    private final JdbcTemplate jdbcTemplate;

    public BotNameRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveBotNameInDatabase(String botName){
        String sql = "INSERT INTO bots (bot_name) VALUES (?)";
        jdbcTemplate.update(sql, botName);
    }

    public boolean existsBotNameInDatabase(String botName){
        String sql = "SELECT COUNT (*) FROM bots WHERE bot_name = ?";
        int count = jdbcTemplate.queryForObject(sql, Integer.class, botName);
        return count > 0;
    }

    public Optional<Object> findById(Long id) {
    }
}

