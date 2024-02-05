package com.example.autocryptotrader.controller;

import com.example.autocryptotrader.model.Bot;
import com.example.autocryptotrader.repository.PairTokenEntity;
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

    @GetMapping("/bot/tokenPair")
    public String addListPairTokenInModel(Model model){
        List<PairTokenEntity> pairTokenList = botParametersService.getPairTokenFromDataBase();
        model.addAttribute("tokenPair", pairTokenList);
        return "parametersBot";
    }

    @PostMapping("/bot/parametersBot")
    public String receiveBotParameters(@RequestBody BotParameters botParameters){

        return "Parameters bot add in database OK";
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