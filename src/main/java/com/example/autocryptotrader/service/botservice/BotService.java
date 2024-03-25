package com.example.autocryptotrader.service.botservice;


import com.example.autocryptotrader.model.BotDTO;
import com.example.autocryptotrader.repository.BotEntity;
import org.springframework.stereotype.Service;

@Service
public interface BotService {
    Boolean searchBotInDatabase(Long clientId, String nameBot, String typeTradingDirection);

    void addBotInDataBase(BotEntity botEntity);

    BotDTO getParametersBotFromDatabase(Long id);

}
