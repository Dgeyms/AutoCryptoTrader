package com.example.autocryptotrader.service.botservice;

import com.example.autocryptotrader.model.Bot;
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
    public void addNameBotInDataBase(String botName) {
        botRepository.saveBotNameInDatabase(botName);
    }

    @Override
    public boolean searchBotInDatabase(Long id) {
        return botRepository.existsBotNameInDatabase(id);
    }

    @Override
    public Bot getParametersBotFromDatabase(Long id) {
        return botRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Bot not found with id " + id));
    }
}
