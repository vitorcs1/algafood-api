package com.algaworks.estudos.springalgaworks.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.estudos.springalgaworks.di.modelo.Cliente;

@Component
@Qualifier("SMS")
public class NotificadorSMS implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s atraves do telefone %s: %s", cliente.getNome(), cliente.getTelefone(), mensagem);
    }
    
}
