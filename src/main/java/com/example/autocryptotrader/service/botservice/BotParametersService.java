package com.example.autocryptotrader.service.botservice;


import com.example.autocryptotrader.repository.PairTokenEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BotParametersService<botParameters> {
    List<PairTokenEntity> getPairTokenFromDataBase();

    void addNameBotInDataBase(String botName);
}
