/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import negocio.Curso;

/**
 *
 * @author Nanda
 */
public interface IRepositorioCursos {
    public void inserir(Curso curso);
    public boolean existe(int idCurso);
    public void atualizar(Curso curso);
    public Curso procurarPorId(int idCurso);
    public void deletar(int idCurso);
    public ArrayList<Cursos> listarCursos();
    
}
