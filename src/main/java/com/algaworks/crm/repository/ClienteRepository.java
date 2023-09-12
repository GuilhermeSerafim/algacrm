package com.algaworks.crm.repository;

import com.algaworks.crm.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Aqui dizemos que é um componente do Spring
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
     //Não precisamos implementar os metodos principais, pois o JpaRepository já faz isso pra gente
    //Metodos como listagem, inclusão, etc...
}
