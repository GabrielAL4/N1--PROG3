package br.edu.femass.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LivroTest {
    @Test
    void getCodigo() {
        List<Autor> autores = new ArrayList<>();
        Livro livro = new Livro(
                "Harry Potter",
                autores
        );
        Long esperado = livro.getCodigo();
        Assertions.assertEquals(esperado, livro.getCodigo());
    }

    @Test
    void setCodigo() {
        List<Autor> autores = new ArrayList<>();
        Livro livro = new Livro(
                "Harry Potter",
                autores
        );
        livro.setCodigo(2l);
        Long esperado = livro.getCodigo();
        Assertions.assertEquals(esperado, livro.getCodigo());
    }

    @Test
    void getTitulo(){
        List<Autor> autores = new ArrayList<>();
        Livro livro = new Livro(
                "Harry Potter",
                autores
        );
        String esperado = "Harry Potter";
        Assertions.assertEquals(esperado, livro.getTitulo());
    }

    @Test
    void setTitulo() {
        List<Autor> autores = new ArrayList<>();
        Livro livro = new Livro(
                "Harry Potter",
                autores
        );
        String esperado = "Harry Potter 1";
        livro.setTitulo("Harry Potter 1");
        Assertions.assertEquals(esperado, livro.getTitulo());
    }

    @Test
    void getNacionalidade(){
        Autor autor = new Autor(
                "GabrieL",
                "Albuquerque",
                "Brasileiro"
        );
        String esperado = "Brasileiro";
        Assertions.assertEquals(esperado, autor.getNacionalidade());
    }

    @Test
    void setNacionalidade(){
        Autor autor = new Autor(
                "GabrieL",
                "Albuquerque",
                "Brasileiro"
        );
        autor.setNacionalidade("Britanico");
        String esperado = "Britanico";
        Assertions.assertEquals(esperado, autor.getNacionalidade());
    }
}
