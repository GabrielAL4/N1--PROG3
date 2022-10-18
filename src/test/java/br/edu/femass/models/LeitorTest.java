package br.edu.femass.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeitorTest {

    @Test
    void getCodigo(){
        Leitor leitor = new Leitor(
                "Antonio",
                "Rua 1",
                "222377382672"
        );
        Long esperado = leitor.getCodigo();
        Assertions.assertEquals(esperado, leitor.getCodigo());
    }

    @Test
    void setCodigo(){
        Leitor leitor = new Leitor(
                "Antonio",
                "Rua 1",
                "222377382672"
        );
        leitor.setCodigo(128L);
        Long esperado = leitor.getCodigo();
        Assertions.assertEquals(esperado, leitor.getCodigo());
    }

    @Test
    void getNome() {
        Leitor leitor = new Leitor(
                "Antonio",
                "Rua 1",
                "222377382672"
        );
        String esperado = "Antonio";
        Assertions.assertEquals(esperado, leitor.getNome());
    }

    @Test
    void setNome() {
        Leitor leitor = new Leitor(
                "Antonio",
                "Rua 1",
                "222377382672"
        );
        String esperado = "Rafael";
        leitor.setNome("Rafael");
        Assertions.assertEquals(esperado, leitor.getNome());
    }

    @Test
    void getEndereco() {
        Leitor leitor = new Leitor(
                "Antonio",
                "Rua 1",
                "222377382672"
        );
        String esperado = "Rua 1";
        Assertions.assertEquals(esperado, leitor.getEndereco());
    }

    @Test
    void setEndereco() {
        Leitor leitor = new Leitor(
                "Antonio",
                "Rua 1",
                "222377382672"
        );
        String esperado = "Rua 2";
        leitor.setEndereco("Rua 2");
        Assertions.assertEquals(esperado, leitor.getEndereco());
    }

    @Test
    void getTelefone() {
        Leitor leitor = new Leitor(
                "Antonio",
                "Rua 1",
                "222377382672"
        );
        String esperado = "222377382672";
        Assertions.assertEquals(esperado, leitor.getTelefone());
    }

    @Test
    void setTelefone() {
        Leitor leitor = new Leitor(
                "Antonio",
                "Rua 1",
                "222377382672"
        );
        String esperado = "2254581524";
        leitor.setTelefone("2254581524");
        Assertions.assertEquals(esperado, leitor.getTelefone());
    }
}

