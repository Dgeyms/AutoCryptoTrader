package com.example.autocryptotrader.controller;

import com.example.autocryptotrader.model.Bot;
import com.example.autocryptotrader.model.BotParameters;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/desing")
@SessionAttributes("bot")
public class BotController {

    @ModelAttribute
    public String addParamsBootInModel(Model model){
        List<BotParameters> botParametersList = Arrays.asList(
            new BotParameters("ARB", BotParameters.TypeTradingDirection.LONG, "ARB/USDT",
                    2, 1.1, 10.2)
        );
        model.addAttribute("bot", new Bot());
        //model.addAttribute("botParametersList", botParametersList);
        return "Мой ботс";
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