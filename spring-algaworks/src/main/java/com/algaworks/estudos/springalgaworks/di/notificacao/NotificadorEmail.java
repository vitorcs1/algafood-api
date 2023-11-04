package com.algaworks.estudos.springalgaworks.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.estudos.springalgaworks.di.modelo.Cliente;

@Component
@Qualifier("Email")
public class NotificadorEmail implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s atraves do email %s: %s", cliente.getNome(), cliente.getEmail(), mensagem);
    }
    
}
