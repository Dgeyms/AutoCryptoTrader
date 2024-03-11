package com.example.autocryptotrader.service.botservice;

import com.example.autocryptotrader.model.Bot;
import com.example.autocryptotrader.repository.BotNameRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
public class BotParametersServiceImpl implements BotParametersService {
    private final BotNameRepository botNameRepository;

    public BotParametersServiceImpl(BotNameRepository botNameRepository) {
        this.botNameRepository = botNameRepository;
    }
    @Override
    public void addNameBotInDataBase(String botName) {
        botNameRepository.saveBotNameInDatabase(botName);
    }

    @Override
    public boolean searchBotInDatabase(String botName) {
        return botNameRepository.existsBotNameInDatabase(botName);
    }

    @Override
    public Bot getParametersBotFromDatabase(Long id) {
        return botNameRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Bot not found with id " + id));
    }
}
