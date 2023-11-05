package com.algaworks.estudos.springalgaworks.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.estudos.springalgaworks.di.notificacao.Notificador;
import com.algaworks.estudos.springalgaworks.di.service.AtivarClienteEvent;

@Component
public class NotificacaoListenerEvent {
    
    @Autowired
    @Qualifier("Email")
    private Notificador notificador;

    @EventListener
    public void enviarMensagem(AtivarClienteEvent ativarClienteEvent){
        notificador.notificar(ativarClienteEvent.getCliente(), "A sua conta está ativada");
    }
}
