package com.example.autocryptotrader.controller;

import com.example.autocryptotrader.model.Bot;
import com.example.autocryptotrader.model.BotParameters;
import com.example.autocryptotrader.service.botservice.BotParametersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/bot")
public class BotController {
    private final BotParametersService botParametersService;
    @Autowired
    public BotController(BotParametersService botParametersService) {
        this.botParametersService = botParametersService;
    }

    @PostMapping("/parametersBot")
    public void receiveBotParameters(@RequestBody BotParameters botParameters){
        botParametersService.addNameBotInDataBase(botParameters.getNameBot());
    }

    @GetMapping
    public String showDesignForm(){
        return "parametersBot";
    }
    @ModelAttribute(name = "bot")
    public Bot bot(){
        return new Bot();
    }

}