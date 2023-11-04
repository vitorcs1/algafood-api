package com.algaworks.estudos.springalgaworks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.estudos.springalgaworks.di.modelo.Cliente;
import com.algaworks.estudos.springalgaworks.di.service.AtivacaoClienteService;

@Controller
public class testeController {

    @Autowired
    private AtivacaoClienteService ativacaoClienteService;
    
    @GetMapping(value = "/hello")
    @ResponseBody
    public String olaMundo(){

        Cliente joao = new Cliente("João", "xyz@gmail.com", "(11) 4002-8922");

        ativacaoClienteService.ativar(joao);

        return "Hello World!";
    }
}
