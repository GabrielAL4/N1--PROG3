package br.edu.femass.models;

import javax.swing.*;

public class Livro {
    protected String codigo;
    protected String titulo;

    public Livro(String codigo, String titulo, JComboBox<Autor> accessibleContext) {
        this.codigo = codigo;
        this.titulo = titulo;
    }


}
