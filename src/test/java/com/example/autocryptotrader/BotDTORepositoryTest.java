package com.example.autocryptotrader;

import com.example.autocryptotrader.repository.BotRepository;
import com.example.autocryptotrader.service.botservice.BotParametersServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BotDTORepositoryTest {
    @Mock
    private BotRepository botRepository;

    @InjectMocks
    private BotParametersServiceImpl botParametersService;

    @Test
    void testSaveNameBotInDatabase(){
        String nameBot = "ARB/USDT";
        doNothing().when(botRepository).saveBotNameInDatabase(nameBot);

        botParametersService.addNameBotInDataBase(nameBot);

        verify(botRepository, times(1)).saveBotNameInDatabase(nameBot);
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
