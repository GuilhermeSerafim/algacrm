package com.algaworks.crm.service;

import com.algaworks.crm.model.Cliente;
import com.algaworks.crm.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscarPorNome(String nome) {
        return clienteRepository.findByNome(nome);
    }
}


