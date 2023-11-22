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

    @Autowired //Injetar dependencia | Aproveitar o primeiro new, e não criar novos na memoria
    private ClienteRepository clienteRepository;

    //Read
    @GetMapping //Quando chega uma requisição get a raiz do projeto, cai nesse método
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    //Antes
//    @GetMapping("/v1/{nome}")
//    public ResponseEntity<Cliente> buscarClientePorNome(@PathVariable("nome") String nome) {
//        Cliente byNome = clienteRepository.findByNome(nome);
//        return clienteRepository.findByNome(nome).map(registro -> ResponseEntity.ok().body(registro))
//                .orElse(ResponseEntity.notFound().build());
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarClientePorId(@PathVariable("id") Long identificador) {
        Optional<Cliente> optCliente = clienteRepository.findById(identificador);
        Cliente cliente;
        cliente = optCliente.get();
        ResponseEntity<Cliente> body = ResponseEntity.ok().body(cliente);
        return body;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Cliente> adicionarCliente(@RequestBody Cliente cliente) {
        Cliente novoCliente = clienteRepository.save(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCliente);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable Long id) {

        Optional<Cliente> optCliente = clienteRepository.findById(id);
        boolean clienteExiste;
        clienteExiste = optCliente.isPresent();
        if (clienteExiste) {
            clienteRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
