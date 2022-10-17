package br.edu.femass.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlunoTest {

    @Test
    void setPrazoMaximoDevolucao() {
        Aluno aluno = new Aluno("Gabriel",
                "Rua 1",
                "1586252053",
                "2001230020"
        );
        int esperado = 15;
        Assertions.assertEquals(esperado, aluno.getPrazoMaximoDeDevolucao());
    }

    @Test
    void getMatricula() {
        Aluno aluno = new Aluno("Gabriel",
                "Rua 1",
                "1586252053",
                "2001230020"
        );
        String esperado = "2001230020";
        Assertions.assertEquals(esperado, aluno.getMatricula());
    }

    @Test
    void setMatricula() {
        Aluno aluno = new Aluno("Gabriel",
                "Rua 1",
                "1586252053",
                "2001230020"
        );
        String esperado = "276210";
        aluno.setMatricula("276210");
        Assertions.assertEquals(esperado, aluno.getMatricula());
    }
}
