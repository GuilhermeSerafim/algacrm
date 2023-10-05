package com.algaworks.crm.repository;

import com.algaworks.crm.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
     //Não precisamos implementar os metodos principais, pois o JpaRepository já faz isso pra gente
    //Metodos como listagem, inclusão, etc...
}
