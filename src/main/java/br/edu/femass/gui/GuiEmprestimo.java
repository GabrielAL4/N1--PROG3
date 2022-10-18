package br.edu.femass.gui;

import br.edu.femass.dao.DaoAluno;
import br.edu.femass.dao.DaoEmprestimo;
import br.edu.femass.dao.DaoLivro;
import br.edu.femass.dao.DaoProfessor;
import br.edu.femass.models.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;

public class GuiEmprestimo {
    protected JPanel JPEmprestimo;
    private JList listProfessores;
    private JList listLivros;
    private JButton fazerEmprestimoButton;
    private JList listAlunos;

    public GuiEmprestimo(){
        updateList();
        fazerEmprestimoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Emprestimo emprestimo = new Emprestimo(LocalDate.now(), (LocalDate) null,
                            (LocalDate) LocalDate.now(), (List<Livro>) listLivros.getSelectedValuesList(),
                            (List<Professor>) listProfessores.getSelectedValue(), (List<Aluno>) listAlunos.getSelectedValue());
                    new DaoEmprestimo().save(emprestimo);
                    updateList();
                    System.out.println(emprestimo);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }
    private void updateList() {
        try {
            List<Livro> livros = new DaoLivro().getAll();
            List<Aluno> alunos = new DaoAluno().getAll();
            List<Professor> professores = new DaoProfessor().getAll();
            listLivros.setListData(livros.toArray());
            listAlunos.setListData(alunos.toArray());
            listProfessores.setListData(professores.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        GuiEmprestimo guiEmprestimo = new GuiEmprestimo();
        JFrame Lframe = new JFrame("Emprestimo");
        Lframe.setContentPane(guiEmprestimo.JPEmprestimo);
        Lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lframe.pack();
        Lframe.setVisible(true);
    }
}
