package com.algaworks.estudos.springalgaworks.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.estudos.springalgaworks.di.service.AtivarClienteEvent;

@Component
public class EmissaoNotaFiscalListenerEvent {
    
    @EventListener
    public void emissaoNota(AtivarClienteEvent ativarClienteEvent){
        System.out.printf("Emissao da nota fiscal pro cliente %s", ativarClienteEvent.getCliente().getNome());
    }
}
