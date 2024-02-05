package com.example.autocryptotrader.service.botservice;

import com.example.autocryptotrader.repository.BotNameRepository;
import com.example.autocryptotrader.repository.PairTokenEntity;
import com.example.autocryptotrader.repository.TokenPairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BotParametersServiceImpl implements BotParametersService {
    private final TokenPairRepository tokenPairRepository;
    private final BotNameRepository botNameRepository;
    @Autowired
    public BotParametersServiceImpl(TokenPairRepository tokenPairRepository, BotNameRepository botNameRepository) {
        this.tokenPairRepository = tokenPairRepository;
        this.botNameRepository = botNameRepository;
    }

    @Override
    public List<String> getPairTokenFromDataBase() {
        return tokenPairRepository.findAllTokenNames();
    }

    @Override
    public void addNameBotInDataBase(String botName){
        botNameRepository.save(botName);
    };
}
