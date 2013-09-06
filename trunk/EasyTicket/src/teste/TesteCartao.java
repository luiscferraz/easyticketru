/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dados.RepositorioCargos;
import dados.RepositorioCartoes;
import negocio.Cartao;

/**
 *
 * @author Marcela Domingues
 */
public class TesteCartao {
 
     public static void main(String[] args) {
        
         Cartao cartao = new Cartao();
         cartao.setCpfAlunoCartao("100.565.984.24");
         cartao.setStatus("ATIVO");
        
        RepositorioCartoes repositorio = new RepositorioCartoes();
        
        repositorio.inserir(cartao);
        
        
        
 
    }
    
}
