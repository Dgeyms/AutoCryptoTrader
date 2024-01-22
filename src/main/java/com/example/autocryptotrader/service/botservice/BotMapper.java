package com.example.autocryptotrader.service.botservice;
/**
 * это класс, который обеспечивает маппинг (преобразование) объектов одного типа в объекты другого типа.
 * В контексте приложений, использующих Spring и базы данных, мапперы часто применяются для преобразования между объектами,
 * представляющими данные в приложении (например, модели) и объектами, сохраненными в базе данных (например, сущности).
 */

import com.example.autocryptotrader.model.BotParameters;
import com.example.autocryptotrader.repository.BotEntity;
import org.springframework.stereotype.Component;

@Component
public class BotMapper {

    public BotEntity mapToEntity(BotParameters botParameters){
        BotEntity botEntity = new BotEntity();
        botEntity.setNameBot(botParameters.getNameBot());
        botEntity.setTradingDirection(String.valueOf(botParameters.getTypeTradingDirection()));
        botEntity.setTokenPair(botParameters.getTokenPair());
        botEntity.setCreditLeverage(botParameters.getCreditLeverage());
        botEntity.setPercentTakeProfit(botParameters.getPercentTakeProfit());
        botEntity.setDollarOrderVolume(botEntity.getDollarOrderVolume());
        return botEntity;
    }
}
