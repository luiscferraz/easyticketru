/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import interfaces.IRepositorioCartoes;
import negocio.Cartao;

/**
 *
 * @author Nanda
 */
public class RepositorioCartoes implements IRepositorioCartoes {

    @Override
    public void inserir(Cartao cartao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existe(int numeroCartao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Cartao cartao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cartao procurarPorNumero(int numeroCartao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cartao procurarPorCpf(int cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //métodos apenas com assinatura, ainda falta definir a interação com o banco de dados.
     
    
}
