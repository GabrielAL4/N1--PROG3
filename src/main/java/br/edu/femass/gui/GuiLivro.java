package br.edu.femass.gui;

import br.edu.femass.dao.DaoLivro;
import br.edu.femass.models.Autor;
import br.edu.femass.models.Livro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLivro {
    private JTextField campoNomeLivro;
    private JTextField campoCodigoLivro;
    private JButton addLivroButtonButton;
    public JPanel JPLivro;
    private JComboBox<Autor> autorComboBox;
    private JButton cadastrarButton;

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

        addLivroButtonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Autor autor = (Autor) autorComboBox.getSelectedItem();
                    Livro livro = new Livro(campoNomeLivro.getText(), campoCodigoLivro.getText(), autorComboBox);
                    new DaoLivro().save(livro);
                    System.out.println(livro);
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
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
