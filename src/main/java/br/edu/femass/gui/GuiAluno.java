package br.edu.femass.gui;

import br.edu.femass.dao.DaoAluno;
import br.edu.femass.models.Aluno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiAluno {
    private JButton addAlunoButton;
    private JTextField campoTelefoneAluno;
    private JTextField campoEnderecoAluno;
    private JTextField campoNomeAluno;
    private JTextField campoMatriculaAluno;
    public JPanel JPAluno;

    public GuiAluno(){

        addAlunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Aluno aluno = new Aluno(campoNomeAluno.getText(), campoEnderecoAluno.getText(), campoTelefoneAluno.getText(), campoMatriculaAluno.getText());
                    new DaoAluno().save(aluno);
                    System.out.println(aluno);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }
}
