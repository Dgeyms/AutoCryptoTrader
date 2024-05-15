package com.example.autocryptotrader.service.botservice;


import com.example.autocryptotrader.repository.BotEntity;
import org.springframework.stereotype.Service;

@Service
public interface BotService {
    Boolean existBotInDatabase(Long clientId, String nameBot, String typeTradingDirection);

    void addBotInDataBase(BotEntity botEntity);

    BotDTO getParametersBotFromDatabase(Long id);

    Boolean existBotId(Long id);

    void deleteBotFromDataBase(Long id);

    void updateBotFromDatabase(BotEntity botEntity);
}
