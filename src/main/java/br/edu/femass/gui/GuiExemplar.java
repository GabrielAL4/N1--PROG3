package br.edu.femass.gui;

import br.edu.femass.dao.DaoAutor;
import br.edu.femass.dao.DaoExemplar;
import br.edu.femass.dao.DaoLivro;
import br.edu.femass.models.Autor;
import br.edu.femass.models.Exemplar;
import br.edu.femass.models.Livro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GuiExemplar {
    protected JPanel JPExemplar;
    private JList listLivros;
    private JButton addExemplarButton;

    public GuiExemplar(){
        updateList();
        addExemplarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Exemplar exemplar = new Exemplar(listLivros.getSelectedValuesList());
                    new DaoExemplar().save(exemplar);
                    updateList();
                    System.out.println(exemplar);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }
    private void updateList() {
        try {
            List<Livro> livros = new DaoLivro().getAll();
            listLivros.setListData(livros.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        GuiExemplar guiExemplar = new GuiExemplar();
        JFrame Lframe = new JFrame("Cadastro De Exemplar");
        Lframe.setContentPane(guiExemplar.JPExemplar);
        Lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lframe.pack();
        Lframe.setVisible(true);
    }
}
