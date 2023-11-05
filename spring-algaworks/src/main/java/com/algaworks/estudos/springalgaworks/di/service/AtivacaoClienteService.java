package com.algaworks.estudos.springalgaworks.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.algaworks.estudos.springalgaworks.di.modelo.Cliente;

@Component
public class AtivacaoClienteService {

    @Autowired
    private ApplicationEventPublisher eventCliente;

    public void ativar(Cliente cliente){
        
        cliente.ativar();

        eventCliente.publishEvent(new AtivarClienteEvent(cliente));
    }
    
}
