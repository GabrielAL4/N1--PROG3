package br.edu.femass.dao;

import br.edu.femass.models.Aluno;

import java.util.List;

public interface Dao<T> {
    public void save(T object) throws Exception;

    public List<T> getAll() throws Exception;
}