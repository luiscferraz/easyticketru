/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import negocio.Aluno;

/**
 *
 * @author Marcela Domingues
 */
public interface IRepositorioAlunos {
    
    public void inserir(Aluno aluno);
    public boolean existe(int cpf);
    public void atualizar(Aluno aluno);
    public Aluno procurarPorCpf(int cpfAluno);
    public ArrayList<Aluno> buscarPorCurso(int idCurso);
    
}
