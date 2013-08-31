/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import java.util.List;
import negocio.Curso;

/**
 *
 * @author Nanda
 */
public interface IRepositorioCursos {
    public void inserir(Curso curso);
    public boolean existe(int idCurso);
    //public boolean nomeExistente(String nomeCurso);
    public void atualizar(Curso curso);
    public Curso procurarPorId(int idCurso);
    public int findIdByNome(String nome);
    public void deletar(int idCurso);
    public List<Curso> listarCursos();
    
}
