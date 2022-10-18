package br.edu.femass.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmprestimoTest {
    @Test
    void getLivros(){
        List<Livro> livros = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        Emprestimo emprestimo = new Emprestimo(
                LocalDate.now(),
                null,
                null,
                livros,
                professores,
                alunos
        );
        List<Livro> esperado = emprestimo.getLivros();
        Assertions.assertEquals(esperado, emprestimo.getLivros());
    }

    @Test
    void setLivros(){
        List<Livro> livros = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        Emprestimo emprestimo = new Emprestimo(
                LocalDate.now(),
                null,
                null,
                livros,
                professores,
                alunos
        );
        emprestimo.setLivros(livros);
        List<Livro> esperado = emprestimo.getLivros();
        Assertions.assertEquals(esperado, emprestimo.getLivros());
    }

    @Test
    void getProfessores(){
        List<Livro> livros = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        Emprestimo emprestimo = new Emprestimo(
                LocalDate.now(),
                null,
                null,
                livros,
                professores,
                alunos
        );
        List<Professor> esperado = emprestimo.getProfessores();
        Assertions.assertEquals(esperado, emprestimo.getProfessores());
    }

    @Test
    void setProfessores(){
        List<Livro> livros = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        Emprestimo emprestimo = new Emprestimo(
                LocalDate.now(),
                null,
                null,
                livros,
                professores,
                alunos
        );
        emprestimo.setProfessores(professores);
        List<Professor> esperado = emprestimo.getProfessores();
        Assertions.assertEquals(esperado, emprestimo.getProfessores());
    }

    @Test
    void getAlunos(){
        List<Livro> livros = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        Emprestimo emprestimo = new Emprestimo(
                LocalDate.now(),
                null,
                null,
                livros,
                professores,
                alunos
        );
        List<Aluno> esperado = emprestimo.getAlunos();
        Assertions.assertEquals(esperado, emprestimo.getAlunos());
    }

    @Test
    void setAlunos(){
        List<Livro> livros = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        Emprestimo emprestimo = new Emprestimo(
                LocalDate.now(),
                null,
                null,
                livros,
                professores,
                alunos
        );
        emprestimo.setAlunos(alunos);
        List<Aluno> esperado = emprestimo.getAlunos();
        Assertions.assertEquals(esperado, emprestimo.getAlunos());
    }

    @Test
    void getDataEmprestimo(){
        List<Livro> livros = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        Emprestimo emprestimo = new Emprestimo(
                LocalDate.now(),
                null,
                null,
                livros,
                professores,
                alunos
        );
        LocalDate esperado = emprestimo.getDataEmprestimo();
        Assertions.assertEquals(esperado, emprestimo.getDataEmprestimo());
    }

    @Test
    void setDataEmprestimo(){
        List<Livro> livros = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        Emprestimo emprestimo = new Emprestimo(
                LocalDate.now(),
                null,
                null,
                livros,
                professores,
                alunos
        );
        emprestimo.setDataEmprestimo(LocalDate.now());
        LocalDate esperado = emprestimo.getDataEmprestimo();
        Assertions.assertEquals(esperado, emprestimo.getDataEmprestimo());
    }

    @Test
    void getDataDevolucao(){
        List<Livro> livros = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        Emprestimo emprestimo = new Emprestimo(
                LocalDate.now(),
                null,
                null,
                livros,
                professores,
                alunos
        );
        LocalDate esperado = emprestimo.getDataDevolucao();
        Assertions.assertEquals(esperado, emprestimo.getDataDevolucao());
    }

    @Test
    void setDataDevolucao(){
        List<Livro> livros = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        Emprestimo emprestimo = new Emprestimo(
                LocalDate.now(),
                null,
                null,
                livros,
                professores,
                alunos
        );
        emprestimo.setDataDevolucao(emprestimo.getDataDevolucao());
        LocalDate esperado = emprestimo.getDataDevolucao();
        Assertions.assertEquals(esperado, emprestimo.getDataDevolucao());
    }
}
