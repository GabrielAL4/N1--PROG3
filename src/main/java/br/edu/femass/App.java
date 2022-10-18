package br.edu.femass;

import br.edu.femass.gui.GuiMenu;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        GuiMenu guiMenu = new GuiMenu();
        JFrame frame = new JFrame("Menu");
        frame.setContentPane(guiMenu.JPMenu);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
