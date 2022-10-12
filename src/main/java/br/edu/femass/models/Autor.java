package br.edu.femass.models;

public class Autor {
    protected String nome;
    protected String sobrenome;
    protected String nacionalidade;

    public Autor(String nome, String sobrenome, String nacionalidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nacionalidade = nacionalidade;
    }
}
