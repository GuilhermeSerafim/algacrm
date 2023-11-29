package com.algaworks.crm.model;

import javax.persistence.*;
import java.util.Objects;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
