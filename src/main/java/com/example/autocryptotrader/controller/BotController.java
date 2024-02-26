package com.example.autocryptotrader.controller;

import com.example.autocryptotrader.model.Bot;
import com.example.autocryptotrader.service.botservice.BotParametersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bot")
public class BotController {
    private final BotParametersServiceImpl botParametersServiceImpl;

    @Autowired
    public BotController(BotParametersServiceImpl botParametersServiceImpl) {
        this.botParametersServiceImpl = botParametersServiceImpl;
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Hello word";
    }

    @PostMapping("/parametersBot")
    public String receiveBotParameters(
            Model model,
            @RequestParam(value = "botName", required = false) String botName) {
        if(botName == null || botName.isEmpty()){
            return "Error: Bot name is missing_s";
        }else if (false == searchBotInDatabase(botName)) {
            Bot bot = new Bot(botName);
            model.addAttribute("bot", bot);
            botParametersServiceImpl.addNameBotInDataBase(bot.getNameBot());
            model.addAttribute("message", "Bot successfully added to the database");
            return "bots"; // Замените "someView" на имя представления, к которому вы хотите перенаправиться
        } else {
            return "Bot with name" + botName + " OK in database";
        }

    }

    private Boolean searchBotInDatabase(String botName) {
        return botParametersServiceImpl.searchBotInDatabase(botName);
    }
}
// проверка git (сообщение принято)
