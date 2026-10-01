package one.digitalinnovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "telegramApiClient", url = "https://api.telegram.org")
public interface TelegramApiClient {
    @PostMapping("/bot{token}/sendMessage")
    void enviarMensagem(
        @PathVariable("token") String token,
        @RequestParam("chat_id") String chatId,
        @RequestParam("text") String text
    );
}
