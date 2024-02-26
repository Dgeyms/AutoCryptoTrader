package com.example.autocryptotrader.service.botservice;

import com.example.autocryptotrader.repository.BotNameRepository;
import org.springframework.stereotype.Service;

@Service
public class BotParametersServiceImpl implements BotParametersService {
    private final BotNameRepository botNameRepository;

    public BotParametersServiceImpl(BotNameRepository botNameRepository) {
        this.botNameRepository = botNameRepository;
    }
    @Override
    public void addNameBotInDataBase(String botName) {
        botNameRepository.save(botName);
    }

    @Override
    public boolean searchBotInDatabase(String botName) {
        return botNameRepository.existsByBotName(botName);
    }
}
