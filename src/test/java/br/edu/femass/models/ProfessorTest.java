package br.edu.femass.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProfessorTest {
    @Test
    void setPrazoMaximoDevolucao() {
        Professor professor = new Professor(
                "Allan",
                "Rua 1",
                "2298817372",
                "Prog 3"
        );
        int esperado = 30;
        Assertions.assertEquals(esperado, professor.getPrazoMaximoDeDevolucao());
    }

    @Test
    void getDisciplina() {
        Professor professor = new Professor(
                "Allan",
                "Rua 1",
                "2298817372",
                "Prog 3"
        );
        String esperado = "Prog 3";
        Assertions.assertEquals(esperado, professor.getDisciplina());
    }

    @Test
     void setDisciplina() {
        Professor professor = new Professor(
                "Allan",
                "Rua 1",
                "2298817372",
                "Prog 3"
        );
        String esperado = "Programacao de Computadores 3";
        professor.setDisciplina("Programacao de Computadores 3");
        Assertions.assertEquals(esperado, professor.getDisciplina());
    }
}
