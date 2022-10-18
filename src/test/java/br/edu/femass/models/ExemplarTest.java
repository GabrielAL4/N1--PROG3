package br.edu.femass.models;

import jdk.dynalink.linker.LinkerServices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ExemplarTest {

    @Test
    void getCodigo() {
        List<Livro> livros = new ArrayList<>();
        Exemplar exemplar = new Exemplar(
            livros
        );
        Long esperado = exemplar.getCodigo();
        Assertions.assertEquals(esperado, exemplar.getCodigo());
    }

    @Test
    void setCodigo() {
        List<Livro> livros = new ArrayList<>();
        Exemplar exemplar = new Exemplar(
                livros
        );
        exemplar.setCodigo(132L);
        Long esperado = exemplar.getCodigo();
        Assertions.assertEquals(esperado, exemplar.getCodigo());
    }

    @Test
    void getDataAquisicao(){
        List<Livro> livros = new ArrayList<>();
        Exemplar exemplar = new Exemplar(
                livros
        );
        LocalDate esperado = exemplar.getDataAquisicao();
        Assertions.assertEquals(esperado, exemplar.getDataAquisicao());
    }

    @Test
    void setDataAquisicao(){
        List<Livro> livros = new ArrayList<>();
        Exemplar exemplar = new Exemplar(
                livros
        );
        exemplar.setDataAquisicao(LocalDate.ofEpochDay(20-03-2022));
        LocalDate esperado = exemplar.getDataAquisicao();
        Assertions.assertEquals(esperado, exemplar.getDataAquisicao());
    }
}
