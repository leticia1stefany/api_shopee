package com.shoppee.api.dto;

public class CategoriaDto {
    private String nome;
    private String descricao;

    //construtores

    public CategoriaDto() {
    }

    public CategoriaDto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    //getters e setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
