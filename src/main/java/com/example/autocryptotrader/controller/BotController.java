package com.example.autocryptotrader.controller;

import com.example.autocryptotrader.model.Bot;
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
    public Bot getBots(@PathVariable Long id) {
        return botParametersServiceImpl.getParametersBotFromDatabase(id);
    }

    @PostMapping("/parametersBot")
    public String receiveBotParameters(Model model, @Valid @RequestParam Bot bot) {
        if (true == searchBotInDatabase(bot.getId())) {
            return "Bot with id: " + bot.getId() + " OK in database";
        } else {
            Bot bot = new Bot(bot);
            model.addAttribute("bot", bot);
            botParametersServiceImpl.addNameBotInDataBase(bot);
            model.addAttribute("message", "Bot successfully added to the database");
            return "New bot with name " + botName + " CREATE in database"; // Замените "someView" на имя представления, к которому вы хотите перенаправиться
        }
    }

    private Boolean searchBotInDatabase(Long id) {
        return botParametersServiceImpl.searchBotInDatabase(id);
    }
}
// проверка git (сообщение принято)
