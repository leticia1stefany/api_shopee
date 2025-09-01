package com.shoppee.api.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Mercadoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "UUID")
    private UUID id;
    private String nome;
    private double preco;
    private int quantidade;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;





    // cnstrutores

    // Getters and Setters

}
