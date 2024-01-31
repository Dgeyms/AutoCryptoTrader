package com.example.autocryptotrader.model;

import lombok.Data;

import java.util.List;
@Data
public class Bot {
    private String nameBot;
    private List<BotParametersModel> botParametersModelList;
}
