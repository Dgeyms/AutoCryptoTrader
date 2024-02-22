package com.example.autocryptotrader.controller;

import com.example.autocryptotrader.service.botservice.BotParametersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/bot")
public class BotController {
    private final BotParametersServiceImpl botParametersServiceImpl;
    @Autowired
    public BotController(BotParametersServiceImpl botParametersServiceImpl) {
        this.botParametersServiceImpl = botParametersServiceImpl;
    }

    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }

    @PostMapping("/parametersBot")
    public String receiveBotParameters(@RequestParam("botName") String botName){
        botParametersServiceImpl.addNameBotInDataBase(botName);
        return "Bot created successfully!";
    }
   // проверка git (сообщение принято)
}