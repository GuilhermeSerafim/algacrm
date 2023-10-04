package com.algaworks.crm.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Tela 2: Dados Pessoais
    @Column(nullable = false) // Exemplo: tornando o nome obrigatório
    private String nome;

    @Column(nullable = false)
    private String sobrenome;

    @Column(nullable = false, unique = true) // Exemplo: tornando o CPF obrigatório e único
    private String cpf;

    // Tela 3: Dados de Endereço
    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    private String cidade;

    // Tela 1: Dados de Login
    @Column(nullable = false, unique = true) // Exemplo: tornando o email obrigatório e único
    private String email;

    @Column(nullable = false)
    private String senha;

    // Você pode adicionar mais campos conforme necessário para cada tela

    // Métodos getter, setter, equals, hashCode, toString gerados automaticamente
}
