package dev.ifrs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class VolumeTest {

    // Criar mock da classe AudioManager
    @Mock
    private AudioManager audioManager;

    // Injetar mock da classe VolumeUtil
    @InjectMocks
    private VolumeUtil volumeUtil;

    @Test
    public void testAudioManagerSetVolume() {
        // Realizar chamada para método maximizeVolume do VolumeUtil
        volumeUtil.maximizeVolume(100);

        // Verificar se o método setVolume foi chamado uma única vez
        verify(audioManager, times(1)).setVolume(anyInt());
    }
}
