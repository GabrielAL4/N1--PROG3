package br.edu.femass.models;

public class Autor {
    private String nome;
    private String sobreNome;
    private String nacionalidade;

    public Autor(String nome, String sobreNome, String nacionalidade) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.nacionalidade = nacionalidade;
    }

    public Autor() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
