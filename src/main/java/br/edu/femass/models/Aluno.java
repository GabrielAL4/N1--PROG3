package br.edu.femass.models;

public class Aluno extends Leitor{
    protected String matricula;

    public Aluno(String nome, String endereco, String telefone, String matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.matricula = matricula;
        setPrazoMaximoDeDevolucao(15);
    }

    @Override
    public void setPrazoMaximoDeDevolucao(Integer prazoMaximoDeDevolucao) {
        super.setPrazoMaximoDeDevolucao(prazoMaximoDeDevolucao);
    }
}
