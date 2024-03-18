package com.example.autocryptotrader.service.botservice;


import com.example.autocryptotrader.model.Bot;
import org.springframework.stereotype.Service;

@Service
public interface BotParametersService {

    void addBotInDataBase(Bot bot);
    boolean searchBotInDatabase(Long id);

    Bot getParametersBotFromDatabase(Long id);
}
