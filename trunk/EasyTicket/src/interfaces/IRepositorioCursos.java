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
    public void inserir(Curso cartao);
    public boolean existe(Curso cartao);
    public void atualizar(Curso cartao);
    public Curso procurarPorId(int idCurso);
    
}
