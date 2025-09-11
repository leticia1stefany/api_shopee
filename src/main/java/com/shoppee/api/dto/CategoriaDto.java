package com.shoppee.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CategoriaDto {
    private String nome;
    private String descricao;
    @JsonIgnore

    //construtores

    public CategoriaDto() {
    }

    public CategoriaDto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
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
