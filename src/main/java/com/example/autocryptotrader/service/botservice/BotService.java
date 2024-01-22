package com.example.autocryptotrader.service.botservice;

import com.example.autocryptotrader.model.BotParameters;

public interface BotService {
    void saveBotInDatabase(BotParameters botParameters);
}
