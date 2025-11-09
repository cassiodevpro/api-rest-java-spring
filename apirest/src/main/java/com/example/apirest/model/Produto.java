package com.example.apirest.model;

public class Produto {
    //#region Atributos
    private Integer id;

    private String quantidade; 

    private String nome;

    private Double valor;

    private String observacao;

    //#endregion
   
    //#region Construtores

    public Produto(Integer id, String quantidade, String nome, Double valor, String observacao) {
        this.id = id;
        this.quantidade = quantidade;
        this.nome = nome;
        this.valor = valor;
        this.observacao = observacao;
    }
//#endregion

    //#region Getters e Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
//#endregion

    
}
