package com.example.autocryptotrader;

import com.example.autocryptotrader.repository.BotNameRepository;
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
class BotNameRepositoryTest {
    @Mock
    private BotNameRepository botNameRepository;

    @InjectMocks
    private BotParametersServiceImpl botParametersService;

    @Test
    void testSaveNameBotInDatabase(){
        String nameBot = "ARB/USDT";
        doNothing().when(botNameRepository).save(nameBot);

        botParametersService.addNameBotInDataBase(nameBot);

        verify(botNameRepository, times(1)).save(botNameEntity);
    }

    @Test
    void testSearchBotInDatabase_ExistingBot() {
        String botName = "TestBot";
        when(botNameRepository.existsByBotName(botName)).thenReturn(true);

        boolean result = botParametersService.searchBotInDatabase(botName);

        assertTrue(result);
        verify(botNameRepository, times(1)).existsByBotName(botName);
    }
    @Test
    void testSearchBotInDatabase_NonExistingBot(){
        String botName = "NonExistingBot";
        when(botNameRepository.existsByBotName(botName)).thenReturn(false);

        boolean result = botParametersService.searchBotInDatabase(botName);

        assertFalse(result);
        verify(botNameRepository, times(1)).existsByBotName(botName);
    }
}
