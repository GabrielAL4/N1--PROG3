package br.edu.femass.models;

public class Aluno extends Leitor{
    protected String matricula;
    protected int prazo;
    public Aluno(String nome, String endereco, String telefone, String matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.matricula = matricula;
        this.prazo = setPrazoMaximoDeDevolucao(15);
    }
    public Aluno() {
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public int setPrazoMaximoDeDevolucao(Integer prazoMaximoDeDevolucao) {
        return super.setPrazoMaximoDeDevolucao(prazoMaximoDeDevolucao);
    }
}
