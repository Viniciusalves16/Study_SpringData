package com.example.spring_data.controller;


import com.example.spring_data.model.ClientEntity;
import com.example.spring_data.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("registry")
public class Request {

    @Autowired
    ClientRepository clientRepository;
    //todo:@Autowired injeção de dependência


    //todo: consultando através do id
    @GetMapping("{id}")
    public ClientEntity consultClient(@PathVariable String id) {
        return clientRepository.findById(Long.valueOf(id)).get();

    }

    //todo: Possivel analisar que ao consultar informações apenas da tabela Cliente, tudo que for da tabela Endereco não será carregado automaticamente
    @GetMapping("/{id}/consult")
    public ClientEntity fetchTypeLazy(@PathVariable String id) {
        ClientEntity c = clientRepository.buscaDadosCliente(Long.valueOf(id));
        return c;


    }


}
