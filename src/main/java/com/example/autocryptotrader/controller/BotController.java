package com.example.autocryptotrader.controller;

import com.example.autocryptotrader.model.Bot;
import com.example.autocryptotrader.model.BotParametersModel;
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

    @GetMapping("/tokenPair")
    public String addListPairTokenInModel(Model model){
        List<String> pairTokenList = botParametersService.getPairTokenFromDataBase();
        if(pairTokenList.isEmpty()){
            return "Error no tokenPair";
        }
        for (String listToken : pairTokenList){
            System.out.println("Котировки из базы данных: " + listToken);
        }
        model.addAttribute("tokenPair", pairTokenList);
        model.addAttribute("botParametersModel", new BotParametersModel());
        return "parametersBot";
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