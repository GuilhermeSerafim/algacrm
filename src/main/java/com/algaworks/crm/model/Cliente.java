package com.algaworks.crm.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data //Gerando Getters, Setters, hashcode, equals, toString, etc... - códigos boilerplates
@Entity //JPA - Entidade (tabela Cliente no banco de dados)
public class Cliente {

    @Id //Propriedade que identifica nossa identidade //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Estrategia para a geração de uma nova id
    private long id;

    @Column //posso usar > (nullable = false) - not null no banco de dados
    private String nome;
}