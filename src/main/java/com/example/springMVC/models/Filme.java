package com.example.springMVC.models;

public class Filme {

    private String titulo;
    private String descricao;
    private String categoriaPrincipal;
    private String ano;
    private String duracao;

    //1º Método Construtor
    public Filme() {
    }

    //2º Método Construtor
    public Filme(String titulo, String descricao, String categoriaPrincipal, String ano, String duracao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoriaPrincipal = categoriaPrincipal;
        this.ano = ano;
        this.duracao = duracao;
    }

    //Métodos Set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setCategoriaPrincipal(String categoriaPrincipal) {
        this.categoriaPrincipal = categoriaPrincipal;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    //Métodos Get
    public String getTitulo() {
        return titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getCategoriaPrincipal() {
        return categoriaPrincipal;
    }
    public String getAno() {
        return ano;
    }
    public String getDuracao() {
        return duracao;
    }

    //Método para Mostrar Dados
    public void mostraDados(){
        System.out.println("<<  " + this.titulo + "  >>" +
                           "\n\n Descrição:\n " + this.descricao +
                           "\n\n Categoria Principal: " + this.categoriaPrincipal +
                           "\n Ano de Lançamento: " + this.ano +
                           "\n Duração: " + this.duracao);
    }
}
