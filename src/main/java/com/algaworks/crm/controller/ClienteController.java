package com.algaworks.crm.controller;

import com.algaworks.crm.model.Cliente;
import com.algaworks.crm.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired //Injetar dependencia
    private ClienteRepository clienteRepository;

    //Read
    @GetMapping //Quando chega uma requisição get a raiz do projeto, cai nesse método
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarClientePorId(@PathVariable("id") Long identificador) {
        return clienteRepository.findById(identificador).map(registro -> ResponseEntity.ok().body(registro))
                .orElse(ResponseEntity.notFound().build());
    }


    //Created
    @PostMapping() //Quando chega uma requisição post a raiz do projeto, cai nesse método
    @ResponseStatus(HttpStatus.CREATED) //201 - Created | Se não vai vir um status 200 ...
    public Cliente adicionarCliente(@RequestBody Cliente cliente) { //Essa anotação faz com que o corpo da requisição que é um objeto JSON seja convertido para um objeto JAVA Cliente cliente
        return clienteRepository.save(cliente);
    }

    //Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable Long id) {
        if(clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
        } else {
            return ResponseEntity.notFound().build();
        }
        return null;
    }
}
