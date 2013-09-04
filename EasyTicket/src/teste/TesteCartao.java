/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dados.RepositorioCartoes;
import negocio.Cartao;

/**
 *
 * @author Marcela Domingues
 */
public class TesteCartao {
 
     public static void main(String[] args) {
        // TODO code application logic here
        Cartao cartao = new Cartao();
        cartao.setNumCartao(21340);
        cartao.setStatus("ATIVO");
        cartao.setSaldo(0);
        cartao.setIdAlunoCartao(1);
        
        RepositorioCartoes repositorio = new RepositorioCartoes();
        
        repositorio.inserir(cartao);
        
        
 
    }
    
}
