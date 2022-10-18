package br.edu.femass.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiAtendente {
    protected JPanel JPAtendente;
    private JButton cadastrarLeitorButton;
    private JButton realizarEmprestimoButton;

    public GuiAtendente(){
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

        realizarEmprestimoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    GuiEmprestimo guiEmprestimo = new GuiEmprestimo();
                    JFrame Lframe = new JFrame("Emprestimo");
                    Lframe.setContentPane(guiEmprestimo.JPEmprestimo);
                    Lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    Lframe.pack();
                    Lframe.setVisible(true);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }
}
