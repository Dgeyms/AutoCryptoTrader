package com.example.autocryptotrader.service.botservice;


import org.springframework.stereotype.Service;

@Service
public interface BotParametersService {

    void addNameBotInDataBase(String botName);
    boolean searchBotInDatabase(String botName);
}
