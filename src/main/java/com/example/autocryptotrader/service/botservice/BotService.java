package com.example.autocryptotrader.service.botservice;

import com.example.autocryptotrader.model.BotParams;

public interface BotService {
    void saveBotInDatabase(BotParams botParams);
}
