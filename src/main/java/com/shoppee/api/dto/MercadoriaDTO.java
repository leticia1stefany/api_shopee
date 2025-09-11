package com.shoppee.api.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shoppee.api.entity.Categoria;
import com.shoppee.api.entity.Fornecedor;

public class MercadoriaDTO {

    private String nome;
    private double preco;
    private int quantidade;
@JsonIgnore
    private Categoria categoria;
    private Fornecedor fornecedor;

    public MercadoriaDTO() {
    }
    public MercadoriaDTO(String nome, double preco, int quantidade, Categoria categoria, Fornecedor fornecedor){
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
        this.categoria=categoria;
        this.fornecedor=fornecedor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}