package com.example.autocryptotrader.service.botservice;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BotFormsService {

    List<String> getPairTokenFromDataBase();
}
