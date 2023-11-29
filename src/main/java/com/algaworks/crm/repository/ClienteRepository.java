package com.algaworks.crm.repository;

import com.algaworks.crm.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    public Cliente findByNome(String nome);
}
