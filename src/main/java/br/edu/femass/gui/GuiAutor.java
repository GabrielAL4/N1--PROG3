package br.edu.femass.gui;

import br.edu.femass.dao.DaoAluno;
import br.edu.femass.dao.DaoAutor;
import br.edu.femass.models.Autor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiAutor {
    private JTextField CampoNome;
    private JTextField CampoSobrenome;
    private JTextField CampoNacionalidade;
    private JButton adcionarButton;
    public JPanel JPAutor;


    public GuiAutor() {
        adcionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Autor autor = new Autor(CampoNome.getText(), CampoSobrenome.getText(), CampoNacionalidade.getText());
                    new DaoAutor().save(autor);
                    System.out.println(autor);
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        GuiAutor guiAutor = new GuiAutor();
        JFrame frame = new JFrame("Cadastro De Autor");
        frame.setContentPane(guiAutor.JPAutor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
