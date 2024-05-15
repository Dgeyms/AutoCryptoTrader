package com.example.autocryptotrader.service.botservice;

import com.example.autocryptotrader.repository.BotEntity;
import com.example.autocryptotrader.repository.BotRepository;
import com.example.autocryptotrader.util.NotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class BotServiceImpl implements BotService {
    private final BotRepository botRepository;
    private final ModelMapper modelMapper;

    public BotServiceImpl(BotRepository botRepository) {
        this.botRepository = botRepository;
        this.modelMapper = new ModelMapper();
    }

    public Boolean existBotInDatabase(Long clientId, String nameBot, String typeTradingDirection) {
        return botRepository.existsBotNameInDatabase(clientId, nameBot, typeTradingDirection);
    }

    @Override
    public void addBotInDataBase(BotEntity botEntity) {
        botRepository.save(botEntity);
    }

    @Override
    public BotDTO getParametersBotFromDatabase(Long id) {
        BotEntity botEntity = botRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Bot not found"));
        return modelMapper.map(botEntity, BotDTO.class);
    }

    @Override
    public void updateBotFromDatabase(BotEntity botEntity) {
        botRepository.save(botEntity);
    }

    @Override
    public void deleteBotFromDataBase(Long id) {
        botRepository.deleteById(id);
    }

    @Override
    public Boolean existBotId(Long id) {
        return botRepository.existsById(id);
    }


}
