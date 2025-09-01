package com.shoppee.api.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "UUID")
    private UUID id;
    private String nome;
    private String descricao;

    @OneToMany(mappedBy = "categoria")
    private List<Mercadoria> mercadorias;


}
