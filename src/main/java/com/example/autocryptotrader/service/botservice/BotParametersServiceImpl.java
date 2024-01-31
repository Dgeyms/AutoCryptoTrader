package com.example.autocryptotrader.service.botservice;

import com.example.autocryptotrader.repository.TokenPairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BotParametersServiceImpl implements BotParametersService {
    private final TokenPairRepository tokenPairRepository;
    @Autowired
    public BotParametersServiceImpl(TokenPairRepository tokenPairRepository) {
        this.tokenPairRepository = tokenPairRepository;
    }

    @Override
    public List<String> getPairTokenFromDataBase() {
        tokenPairRepository.findAll();
        return null;
    }
}
