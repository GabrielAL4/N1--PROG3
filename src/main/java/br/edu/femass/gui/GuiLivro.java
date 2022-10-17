package br.edu.femass.gui;

import br.edu.femass.dao.DaoAutor;
import br.edu.femass.dao.DaoLivro;
import br.edu.femass.models.Autor;
import br.edu.femass.models.Livro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GuiLivro {
    private JTextField campoNomeLivro;
    private JButton addLivroButtonButton;
    public JPanel JPLivro;
    private JButton cadastrarButton;
    private JList listAutor;
    private JButton atualizarButton;

    public GuiLivro() {

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiAutor guiAutor = new GuiAutor();
                JFrame frame = new JFrame("Cadastro De Autor");
                frame.setContentPane(guiAutor.JPAutor);
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        updateList();
        addLivroButtonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Livro livro = new Livro(campoNomeLivro.getText(), listAutor.getSelectedValuesList());
                    new DaoLivro().save(livro);
                    updateList();
                    System.out.println(livro);
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateList();
            }
        });
    }
    private void updateList() {


        try {
            List<Autor> autores = new DaoAutor().getAll();
            listAutor.setListData(autores.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        GuiLivro guiLivro = new GuiLivro();
        JFrame Lframe = new JFrame("Cadastro De Livro");
        Lframe.setContentPane(guiLivro.JPLivro);
        Lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lframe.pack();
        Lframe.setVisible(true);
    }
}
