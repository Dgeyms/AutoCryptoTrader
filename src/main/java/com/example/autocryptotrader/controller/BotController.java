package com.example.autocryptotrader.controller;

import com.example.autocryptotrader.model.BotDTO;
import com.example.autocryptotrader.repository.BotEntity;
import com.example.autocryptotrader.service.botservice.BotServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequestMapping("/bot")
public class BotController {
    private final BotServiceImpl botServiceImpl;

    public BotController(BotServiceImpl botServiceImpl) {
        this.botServiceImpl = botServiceImpl;
    }

    @GetMapping("/bot/{id}")
    public ResponseEntity<BotDTO> getBot(@PathVariable Long id) {
        BotDTO botDTO = botServiceImpl.getParametersBotFromDatabase(id);
        if (botDTO != null) {
            return ResponseEntity.ok(botDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/createBot")
    public String receiveBotParameters(Model model, @Valid @ModelAttribute BotDTO botDTO) {
        if (searchBotInDatabase(botDTO.getClientId(), botDTO.getNameBot(), botDTO.getTypeTradingDirection())) {
            return "Bot with name: " + botDTO.getNameBot() + " OK in database";
        } else {
            BotEntity botEntity = new BotEntity(botDTO);
            botServiceImpl.addBotInDataBase(botEntity);
            //model.addAttribute("message", "Bot successfully added to the database");
            return "New bot with name " + botDTO.getNameBot() + " CREATE in database";
        }
    }

    @DeleteMapping("/bot/deleteBot/{id}")
    public String deleteBotFromDatabase(@PathVariable Long id) {
        if (!existBotId(id)) {
            return "Bot with id " + id + " not found";
        } else {
            botServiceImpl.deleteBotFromDataBase(id);
        }
        return "Bot with id " + id + " deleted";
    }

    private Boolean searchBotInDatabase(Long clientId, String nameBot, String typeTradingDirection) {
        return botServiceImpl.existBotInDatabase(clientId, nameBot, typeTradingDirection);
    }

    private Boolean existBotId(Long id) {
        return botServiceImpl.existBotId(id);
    }
}
