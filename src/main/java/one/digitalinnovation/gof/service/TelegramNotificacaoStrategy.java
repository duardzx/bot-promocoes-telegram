package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Promocao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TelegramNotificacaoStrategy implements NotificacaoStrategy {

    @Autowired
    private TelegramApiClient telegramApiClient;

    @Value("${telegram.api.token}")
    private String botToken;

    @Value("${telegram.api.chat-id}")
    private String chatId;

    @Override
    public void enviarNotificacao(Promocao promocao) {
        String alertaMensagem = "Promoção detectada: " + promocao.getNomeProduto() + " - Apenas R$ " + promocao.getPrecoOriginal();

        telegramApiClient.enviarMensagem(botToken, chatId, alertaMensagem);
    }
}