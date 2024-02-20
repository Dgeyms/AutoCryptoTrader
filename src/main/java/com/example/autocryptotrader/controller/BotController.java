package com.example.autocryptotrader.controller;

import com.example.autocryptotrader.service.botservice.BotParametersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class BotController {
    private final BotParametersService botParametersService;
    @Autowired
    public BotController(BotParametersService botParametersService) {
        this.botParametersService = botParametersService;
    }

    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }

    @PostMapping("parametersBot")
    public String receiveBotParameters(@RequestParam("botName") String botName){
        botParametersService.addNameBotInDataBase(botName);
        return "Bot created successfully!";
    }


}