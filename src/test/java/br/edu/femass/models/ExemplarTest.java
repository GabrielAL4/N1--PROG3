package br.edu.femass.models;

import jdk.dynalink.linker.LinkerServices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
    void setNome() {
        Autor autor = new Autor(
                "GabrieL",
                "Albuquerque",
                "Brasileiro"
        );
        String esperado = "Rafael";
        autor.setNome("Rafael");
        Assertions.assertEquals(esperado, autor.getNome());
    }

    @Test
    void getSobrenome(){
        Autor autor = new Autor(
                "GabrieL",
                "Albuquerque",
                "Brasileiro"
        );
        String esperado = "Albuquerque";
        Assertions.assertEquals(esperado, autor.getSobrenome());
    }

    @Test
    void setSobrenome() {
        Autor autor = new Autor(
                "GabrieL",
                "Albuquerque",
                "Brasileiro"
        );
        String esperado = "Basileu";
        autor.setSobrenome("Basileu");
        Assertions.assertEquals(esperado, autor.getSobrenome());
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
