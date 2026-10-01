package one.digitalinnovation.gof.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Promocao;

@Service 
public class PromocaoService {
    @Autowired 
    private NotificacaoStrategy notificacaoStrategy;

    public void salvarPromocao(Promocao promocao){
        System.out.println("Salvando no banco de dados");
        notificacaoStrategy.enviarNotificacao(promocao);
    }
}
