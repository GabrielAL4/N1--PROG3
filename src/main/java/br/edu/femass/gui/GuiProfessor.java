package br.edu.femass.gui;

import br.edu.femass.dao.DaoProfessor;
import br.edu.femass.models.Professor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiProfessor {
    private JTextField campoNomeProfessor;
    private JTextField campoEnderecoProfessor;
    private JTextField campoTelefoneProfessor;
    private JTextField campoDisciplinaProfessor;
    private JButton addProfessorButton;
    public JPanel JPProfessor;


    public GuiProfessor(){
        addProfessorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Professor professor = new Professor(campoNomeProfessor.getText(), campoEnderecoProfessor.getText(), campoTelefoneProfessor.getText(), campoDisciplinaProfessor.getText());
                    new DaoProfessor().save(professor);
                    System.out.println(professor);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }
}
