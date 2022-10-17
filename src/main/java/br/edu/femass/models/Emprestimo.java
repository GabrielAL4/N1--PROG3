package br.edu.femass.models;

import java.time.LocalDate;
import java.util.Locale;

public class Emprestimo {
    protected LocalDate dataEmprestimo;
    protected LocalDate dataDevolucao;
    protected LocalDate dataPrevistaDevolucao;

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucao, LocalDate dataPrevistaDevolucao) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public Emprestimo() {
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setDataPrevistaDevolucao(LocalDate dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }


}
