package com.example.autocryptotrader.service.botservice;

import com.example.autocryptotrader.model.BotParameters;
import com.example.autocryptotrader.repository.BotEntity;
import com.example.autocryptotrader.repository.BotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BotServiceImpl implements BotService {
    private BotRepository botRepository;
    private BotMapper botMapper;
    @Autowired
    public BotServiceImpl(BotRepository botRepository, BotMapper botMapper) {
        this.botRepository = botRepository;
        this.botMapper = botMapper;
    }

    public void saveBotInDatabase(BotParameters botParameters) {
        BotEntity botEntity = botMapper.mapToEntity(botParameters);
        botRepository.save(botEntity);
    }
}
