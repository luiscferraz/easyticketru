/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dados.RepositorioCursos;

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
    
}
