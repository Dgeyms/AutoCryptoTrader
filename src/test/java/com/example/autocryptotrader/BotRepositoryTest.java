package com.example.autocryptotrader;

import com.example.autocryptotrader.repository.BotEntity;
import com.example.autocryptotrader.repository.BotRepository;
import com.example.autocryptotrader.service.botservice.BotParametersServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BotRepositoryTest {
    @Mock
    private BotRepository botRepository;

    @InjectMocks
    private BotParametersServiceImpl botParametersService;

    @Test
    void testSearchBotInDatabase(){
        Long clientId = 2309L;
        String nameBot = "ARB/USDT";
        String typeTradingDirection = "Long";
        boolean expectedResult = true;
        when(botParametersService.searchBotInDatabase(clientId, nameBot, typeTradingDirection))
                .thenReturn(expectedResult);

        //Call the tested method
        boolean actualResult = botParametersService.searchBotInDatabase(clientId, nameBot, typeTradingDirection);

        // We check that the result corresponds to the expected value
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSearchBotInDatabase_ExistingBot() {
        String botName = "TestBot";
        when(botRepository.existsBotNameInDatabase(botName)).thenReturn(true);

        boolean result = botParametersService.searchBotInDatabase(botName);

        assertTrue(result);
        verify(botRepository, times(1)).existsBotNameInDatabase(botName);
    }
    @Test
    void testSearchBotInDatabase_NonExistingBot(){
        String botName = "NonExistingBot";
        when(botRepository.existsBotNameInDatabase(botName)).thenReturn(false);

        boolean result = botParametersService.searchBotInDatabase(botName);

        assertFalse(result);
        verify(botRepository, times(1)).existsBotNameInDatabase(botName);
    }
}
