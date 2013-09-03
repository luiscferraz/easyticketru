/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dados.RepositorioCursos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nanda
 */
public class CadastroCursos {
    
    private RepositorioCursos cursos;
    
    public CadastroCursos(RepositorioCursos cursos){
        this.cursos = cursos;
    }
    
    public void atualizar(Curso curso){
        cursos.atualizar(curso);  
    }
    
    public void cadastrar(Curso curso){
        cursos.inserir(curso);
    }
    
    public Curso buscaPorId(int idCurso){
        return cursos.procurarPorId(idCurso);
    }
    
    public List<Curso> listarCursos(){
        return cursos.listarCursos();
    }
    
    public boolean verificaExistenciaNome(String nomeCurso){
        if(cursos.findIdByNome(nomeCurso)!=-1){
            return true;
        }else{
            return false;
        }        
    }
    
    public boolean verificaExistenciaId(int idCurso){
        return cursos.existe(idCurso);
    }
    
    public void deletar(int idCurso){
        cursos.deletar(idCurso);
    }
    
    public int findIdByNome(String nome){
        return cursos.findIdByNome(nome);
    }
    
}
