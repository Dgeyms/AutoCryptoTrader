package com.example.autocryptotrader.service.botservice;

import com.example.autocryptotrader.model.BotDTO;
import com.example.autocryptotrader.repository.BotEntity;
import com.example.autocryptotrader.repository.BotRepository;
import com.example.autocryptotrader.util.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class BotParametersServiceImpl implements BotParametersService {
    private final BotRepository botRepository;

    public BotParametersServiceImpl(BotRepository botRepository) {
        this.botRepository = botRepository;
    }

    @Override
    public Boolean searchBotInDatabase(Long clientId, String nameBot, String typeTradingDirection) {
        return botRepository.existsBotNameInDatabase(clientId, nameBot, typeTradingDirection);
    }

    @Override
    public void addBotInDataBase(BotEntity botEntity) {
        botRepository.save(botEntity);
    }


    @Override
    public BotDTO getParametersBotFromDatabase(Long id) {
        return botRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Bot not found with id " + id));
    }
}
