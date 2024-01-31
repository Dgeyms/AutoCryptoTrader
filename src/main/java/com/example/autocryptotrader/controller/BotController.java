package com.example.autocryptotrader.controller;

import com.example.autocryptotrader.model.Bot;
import com.example.autocryptotrader.model.BotParameters;
import com.example.autocryptotrader.service.botservice.BotParametersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/bot")
public class BotController {
    private BotParametersService botParametersService;
    @ModelAttribute("tokenPair")
    @GetMapping("/bot/tokenPair")
    public List<String> addListPairTokenInModel(){
        return botParametersService.getPairTokenFromDataBase();
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