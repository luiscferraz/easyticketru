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
    //métodos apenas com assinatura, ainda falta definir a interação com o banco de dados.
    public void inserir(Cartao cartao){
    }
    
    public boolean existe(int numeroCartao){
      //retorno será um boolean, só foi colocado desta forma até implementar o método  
      return true;
    }
    
    public void atualizar(Cartao cartao){
      
    }
      
    public Cartao procurarPorNumero(int numeroCartao){
      return cartao;
    }
    
    public Cartao procurarPorCpf(int cpf){
      return cartao;
    } 
    
}
