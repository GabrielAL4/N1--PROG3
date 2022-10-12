package br.edu.femass.models;

public class Professor extends Leitor{
    protected String disciplina;

    public Professor(String nome, String endereco, String telefone, String disciplina) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.disciplina = disciplina;
        setPrazoMaximoDeDevolucao(30);
    }

    @Override
    public void setPrazoMaximoDeDevolucao(Integer prazoMaximoDeDevolucao) {
        super.setPrazoMaximoDeDevolucao(prazoMaximoDeDevolucao);
    }
}