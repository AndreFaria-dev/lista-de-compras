package com.example.listadecompras.model;

import java.util.Date;

public class ListaDeCompra {
    public ListaDeCompra(String nome, Date dtCriacao) {
        this.nome = nome;
        this.dtCriacao = dtCriacao;
    }

    String nome;
    Date dtCriacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(Date dtCriacao) {
        this.dtCriacao = dtCriacao;
    }
}
