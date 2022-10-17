package br.edu.femass.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiBibliotecario {


    private JButton cadastrarAutorButton;
    private JButton cadastrarLivroButton;
    private JButton cadastrarLeitorButton;
    private JButton button4;
    private JButton exemplaresButton;
    private JButton button6;
    protected JPanel JPBibliotecario;

    public GuiBibliotecario(){
        cadastrarAutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    GuiAutor guiAutor = new GuiAutor();
                    JFrame frame = new JFrame("Cadastro De Autor");
                    frame.setContentPane(guiAutor.JPAutor);
                    frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        cadastrarLivroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    GuiLivro guiLivro = new GuiLivro();
                    JFrame frame = new JFrame("Cadastro De Livro");
                    frame.setContentPane(guiLivro.JPLivro);
                    frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        cadastrarLeitorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    GuiLeitor guiLeitor = new GuiLeitor();
                    JFrame frame = new JFrame("Cadastro De Autor");
                    frame.setContentPane(guiLeitor.JPLeitor);
                    frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        exemplaresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    GuiExemplar guiExemplar = new GuiExemplar();
                    JFrame frame = new JFrame("Cadastro De Exemplar");
                    frame.setContentPane(guiExemplar.JPExemplar);
                    frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }
}
