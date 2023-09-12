package com.algaworks.crm.controller;

import com.algaworks.crm.model.Cliente;
import com.algaworks.crm.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired //Adicionando instância
    private ClienteRepository clienteRepository;

    @GetMapping //Quando chega uma requisição get a raiz do projeto, cai nesse método
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @PostMapping //Quando chega uma requisição post a raiz do projeto, cai nesse método
    @ResponseStatus(HttpStatus.CREATED) //201 - Created | Se não vai vir um status 200 ...
    public Cliente adicionar(@RequestBody Cliente cliente) { //Essa anotação faz com que o corpo da requisição que é um objeto JSON seja convertido para um objeto JAVA Cliente cliente
        return clienteRepository.save(cliente);
    }
}
