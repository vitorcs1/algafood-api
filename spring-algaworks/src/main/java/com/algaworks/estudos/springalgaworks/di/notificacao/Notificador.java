package com.algaworks.estudos.springalgaworks.di.notificacao;

import com.algaworks.estudos.springalgaworks.di.modelo.Cliente;

public interface Notificador {
    
    public void notificar(Cliente cliente, String mensagem);
    
}
