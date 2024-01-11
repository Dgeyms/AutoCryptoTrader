package com.example.autocryptotrader.service.botservice;
/**
 * это класс, который обеспечивает маппинг (преобразование) объектов одного типа в объекты другого типа.
 * В контексте приложений, использующих Spring и базы данных, мапперы часто применяются для преобразования между объектами,
 * представляющими данные в приложении (например, модели) и объектами, сохраненными в базе данных (например, сущности).
 */

import com.example.autocryptotrader.model.BotParams;
import com.example.autocryptotrader.repository.BotEntity;
import org.springframework.stereotype.Component;

@Component
public class BotMapper {

    public BotEntity mapToEntity(BotParams botParams){
        BotEntity botEntity = new BotEntity();
        botEntity.setNameBot(botParams.getNameBot());
        botEntity.setTradingDirection(botParams.getTradingDirection());
        botEntity.setTokenPair(botParams.getTokenPair());
        botEntity.setCreditLeverage(botParams.getCreditLeverage());
        botEntity.setPercentTakeProfit(botParams.getPercentTakeProfit());
        botEntity.setDollarOrderVolume(botEntity.getDollarOrderVolume());
        return botEntity;
    }
}
