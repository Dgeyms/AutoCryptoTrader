package com.example.autocryptotrader.controller;

import com.example.autocryptotrader.model.BotModel;
import com.example.autocryptotrader.service.botservice.BotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class BotController {
    private final BotService botService;
    @Autowired
    public BotController(BotService botService) {
        this.botService = botService;
    }
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @PostMapping("/createBot")
    public void createBot(@RequestBody BotModel botModel) {
    botService.saveBotInDatabase(botModel);
    }
}