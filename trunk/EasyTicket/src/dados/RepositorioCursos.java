package dados;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import interfaces.IRepositorioCursos;
import negocio.Curso;


/**
 *
 * @author Nanda
 */
public class RepositorioCursos implements IRepositorioCursos {

    @Override
    public void inserir(Curso curso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existe(int idCurso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Curso curso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Curso procurarPorId(int idCurso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
