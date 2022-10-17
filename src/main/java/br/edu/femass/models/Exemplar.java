package br.edu.femass.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exemplar {
    protected Long codigo;
    protected Long incremento = 1L;
    protected LocalDate dataAquisicao;
    protected List<Livro> livros = new ArrayList<>();

    public Exemplar(List<Livro> livros) {
        this.livros = livros;
        this.codigo = incremento;
        this.dataAquisicao= LocalDate.now();
        this.incremento++;
    }

    public List<Livro> getLivros() {
        return livros;
    }
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }
    public void setDataAquisicao(LocalDate dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }
}
