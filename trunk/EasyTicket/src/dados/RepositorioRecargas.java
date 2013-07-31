/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import interfaces.IRepositorioRecargas;
import java.util.ArrayList;
import java.util.Date;
import negocio.Recarga;

/**
 *
 * @author Nanda
 */
public class RepositorioRecargas implements IRepositorioRecargas {

    @Override
    public void inserir(Recarga recarga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existe(int idRecarga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Recarga recarga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Recarga buscarPorId(int idRecarga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Recarga> buscarPorCartao(int idCartao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Recarga> buscarPorData(Date data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
