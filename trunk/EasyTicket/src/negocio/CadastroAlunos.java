/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dados.RepositorioAlunos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nanda
 */
public class CadastroAlunos {
    private RepositorioAlunos alunos;
    
    public CadastroAlunos(RepositorioAlunos repositorioAlunos){
        this.alunos = repositorioAlunos;
    }
    
    public void inserir(Aluno aluno){
        alunos.inserir(aluno);
    }
    public boolean existe(String cpf){
        return alunos.existe(cpf);
    }
    public void atualizar(Aluno aluno){
        alunos.atualizar(aluno);
    }
    public Aluno procurarPorCpf(String cpfAluno){
        return alunos.procurarPorCpf(cpfAluno);
    }
    public void deletar(String cpfAluno){
        alunos.deletar(cpfAluno);
    }
    public ArrayList<Aluno> buscarPorCurso(int idCurso){
        return alunos.buscarPorCurso(idCurso);
    }
    
    public List<Aluno> listarAlunos(){
        return alunos.listarAlunos();
    }
    
}
