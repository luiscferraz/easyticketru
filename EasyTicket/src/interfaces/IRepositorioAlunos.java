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
    public boolean existe(String cpf);
    public void atualizar(Aluno aluno);
    public Aluno procurarPorCpf(String cpfAluno);
    public void deletar(String cpfAluno);
    public ArrayList<Aluno> buscarPorCurso(int idCurso);
    
}
