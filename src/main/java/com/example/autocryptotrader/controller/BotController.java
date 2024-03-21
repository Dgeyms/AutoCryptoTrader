package com.example.autocryptotrader.controller;

import com.example.autocryptotrader.model.BotDTO;
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
    public String receiveBotParameters(Model model, @Valid @ModelAttribute BotDTO bot) {
        if (searchBotInDatabase(bot.getClientId())) {
            return "Bot with id: " + bot.getId() + " OK in database";
        } else {
            model.addAttribute("bot", bot);
            botParametersServiceImpl.addBotInDataBase(bot);
            model.addAttribute("message", "Bot successfully added to the database");
            return "New bot with name " + bot.getNameBot() + " CREATE in database";
        }
    }

    private Boolean searchBotInDatabase(Long id) {
        return botParametersServiceImpl.searchBotInDatabase(id);
    }
}
// проверка git (сообщение принято)
