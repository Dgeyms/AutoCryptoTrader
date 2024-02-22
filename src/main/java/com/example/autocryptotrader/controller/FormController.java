package com.example.autocryptotrader.controller;

import com.example.autocryptotrader.model.BotParameters;
import com.example.autocryptotrader.repository.PairTokenEntity;
import com.example.autocryptotrader.service.botservice.BotFormsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/bot/forms")
public class FormController {

    private final BotFormsServiceImpl botFormsServiceImpl;

    @Autowired
    public FormController(BotFormsServiceImpl botFormsServiceImpl) {
        this.botFormsServiceImpl = botFormsServiceImpl;
    }

    @GetMapping("/tokenPair")
    public String addListPairTokenInModel(Model model) {
        List<String> pairTokenList = botFormsServiceImpl.getPairTokenFromDataBase();
        if (pairTokenList.isEmpty()) {
            return "Error no tokenPair";
        }
        for (String listToken : pairTokenList) {
            System.out.println("Котировки из базы данных: " + listToken);
        }
        model.addAttribute("tokenPair", pairTokenList);
        model.addAttribute("botParametersModel", new BotParameters());
        return "parametersBot";
    }
}
