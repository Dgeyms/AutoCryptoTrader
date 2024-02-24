package com.example.autocryptotrader.service.botservice;


import com.example.autocryptotrader.repository.PairTokenEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BotParametersService {

    void addNameBotInDataBase(String botName);
    boolean searchBotInDatabase(String botName);
}
