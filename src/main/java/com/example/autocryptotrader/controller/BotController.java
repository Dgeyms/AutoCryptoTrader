package com.example.autocryptotrader.controller;

import com.example.autocryptotrader.model.BotDTO;
import com.example.autocryptotrader.repository.BotEntity;
import com.example.autocryptotrader.service.botservice.BotParametersServiceImpl;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequestMapping("/bot")
public class BotController {
    private final BotParametersServiceImpl botParametersServiceImpl;

    public BotController(BotParametersServiceImpl botParametersServiceImpl) {
        this.botParametersServiceImpl = botParametersServiceImpl;
    }

    @GetMapping("/bots/{id}")
    public BotDTO getBots(@PathVariable Long id) {
        return botParametersServiceImpl.getParametersBotFromDatabase(id);
    }

    @PostMapping("/createBot")
    public String receiveBotParameters(Model model, @Valid @ModelAttribute BotDTO botDTO) {
        if (searchBotInDatabase(botDTO.getClientId(), botDTO.getNameBot(), botDTO.getTypeTradingDirection())) {
            return "Bot with name: " + botDTO.getNameBot() + " OK in database";
        } else {
            model.addAttribute("bot", botDTO);
            BotEntity botEntity = new BotEntity(botDTO);
            botParametersServiceImpl.addBotInDataBase(botEntity);
            model.addAttribute("message", "Bot successfully added to the database");
            return "New bot with name " + bot.getNameBot() + " CREATE in database";
        }
    }

    private Boolean searchBotInDatabase(Long clientId, String nameBot, String typeTradingDirection) {
        return botParametersServiceImpl.searchBotInDatabase(id);
    }
}
