package br.edu.femass.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiMenu {
    public JPanel JPMenu;
    private JButton bibliotecarioButton;
    private JButton atendenteButton;

    public GuiMenu() {
        bibliotecarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    GuiBibliotecario guiBibliotecario = new GuiBibliotecario();
                    JFrame frame = new JFrame("Menu Bibliotecario");
                    frame.setContentPane(guiBibliotecario.JPBibliotecario);
                    frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        atendenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    GuiAtendente guiAtendente = new GuiAtendente();
                    JFrame frame = new JFrame("Menu Atendente");
                    frame.setContentPane(guiAtendente.JPAtendente);
                    frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        GuiMenu guiMenu = new GuiMenu();
        JFrame frame = new JFrame("Menu");
        frame.setContentPane(guiMenu.JPMenu);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
