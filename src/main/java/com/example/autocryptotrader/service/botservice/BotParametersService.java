package com.example.autocryptotrader.service.botservice;


import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BotParametersService {
    List<String> getPairTokenFromDataBase();
}