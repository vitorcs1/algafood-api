package com.algaworks.estudos.springalgaworks.di.service;

import com.algaworks.estudos.springalgaworks.di.modelo.Cliente;

public class AtivarClienteEvent {
    
    private Cliente cliente;

    public AtivarClienteEvent(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
