package com.algaworks.crm.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity //JPA - Entidade (tabela Cliente no banco de dados)
public class Cliente {

    @Id //Propriedade que identifica nossa identidade //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Estrategia para a geração de uma nova id

    @Column //É só uma anotação de que é uma coluna
    private long id;

    @Column //posso usar > (nullable = false) - not null no banco de dados
    private String nome;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    //Se caso você ir atrás daquela chave estrategica que o banco gera, terá o mesmo hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
//De forma resumida, o hashcode seria um espaço na memoria, personalizamos ele para ser uma pk gerada no banco de dados