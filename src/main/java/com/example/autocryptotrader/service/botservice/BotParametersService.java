package com.example.autocryptotrader.service.botservice;


import com.example.autocryptotrader.model.Bot;
import org.springframework.stereotype.Service;

@Service
public interface BotParametersService {

    void addNameBotInDataBase(String botName);
    boolean searchBotInDatabase(String botName);

    Bot getParametersBotFromDatabase(Long id);
}
