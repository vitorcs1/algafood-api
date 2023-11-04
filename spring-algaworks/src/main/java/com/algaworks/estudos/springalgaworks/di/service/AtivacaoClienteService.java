package com.algaworks.estudos.springalgaworks.di.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.estudos.springalgaworks.di.modelo.Cliente;
import com.algaworks.estudos.springalgaworks.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

    @Autowired
    @Qualifier("SMS")
    private Notificador notificador;

    @PostConstruct
    public void init(){
        System.out.println("INIT");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("DESTROY");
    }

    public void ativar(Cliente cliente){
        
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
    
}
