package com.algaworks.crm.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data //Código menos verboso e não - código
@Entity
public class Cliente {
//TODOS OS DADOS SERÃO ENVIADOS DO CONSUMO DA API (VIEW)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gerar chave automaticamente
    private long id;

    // Tela 1: Dados de Login
    @Column(nullable = false, unique = true) // Exemplo: tornando o email obrigatório e único
    private String email;

    @Column(nullable = false)
    private String senha;

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

    // Métodos getter, setter, equals, hashCode, toString gerados automaticamente
}
