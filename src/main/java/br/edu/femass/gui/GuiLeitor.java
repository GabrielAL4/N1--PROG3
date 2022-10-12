package br.edu.femass.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLeitor {
    private JButton addAlunoButtonButton;
    private JButton addProfessorButtonButton;
    private JPanel JPLeitor;

    public GuiLeitor(){
        addAlunoButtonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiAluno guiAluno = new GuiAluno();
                JFrame frame = new JFrame("Cadastro De Aluno");
                frame.setContentPane(guiAluno.JPAluno);
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });

        addProfessorButtonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiProfessor guiProfessor = new GuiProfessor();
                JFrame frame = new JFrame("Cadastro De Professor");
                frame.setContentPane(guiProfessor.JPProfessor);
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        GuiLeitor guiLeitor = new GuiLeitor();
        JFrame frame = new JFrame("Cadastro De Leitor");
        frame.setContentPane(guiLeitor.JPLeitor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
