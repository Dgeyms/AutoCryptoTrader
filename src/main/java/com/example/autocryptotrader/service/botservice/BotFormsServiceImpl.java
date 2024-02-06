package com.example.autocryptotrader.service.botservice;

import com.example.autocryptotrader.repository.TokenPairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BotFormsServiceImpl implements BotFormsService{

    private final TokenPairRepository tokenPairRepository;
    @Autowired
    public BotFormsServiceImpl(TokenPairRepository tokenPairRepository) {
        this.tokenPairRepository = tokenPairRepository;
    }

    @Override
    public List<String> getPairTokenFromDataBase() {
        return tokenPairRepository.findAllTokenNames();
    }
}
