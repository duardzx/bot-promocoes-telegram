package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Promocao;

public interface NotificacaoStrategy {
    void enviarNotificacao(Promocao promocao);
}
