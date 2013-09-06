/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dados.RepositorioCartoes;
import java.util.List;

/**
 *
 * @author Nanda
 */
public class CadastroCartoes {
  
  private RepositorioCartoes cartoes;
  
  public CadastroCartoes(RepositorioCartoes repositorioCartoes){
    this.cartoes = repositorioCartoes;  
  }
  
  public void atualizar(Cartao cartao){
    cartoes.atualizar(cartao);  
  }
  
  public void cadastrar(Cartao cartao){
    cartoes.inserir(cartao);
  }
  
 public Cartao buscaCartaoPorNumero(int numeroCartao){
    return cartoes.procurarPorNumero(numeroCartao);
  }
  
  public List<Cartao> listarCartoes(){
        return cartoes.listarCartoes();
    }
  
  public Cartao buscaPorCpf(String cpf){
    return cartoes.procurarPorCpf(cpf);
  }
  
  public boolean verificaExistenciaCartaoByNumero(int numCartao){
      return cartoes.existe(numCartao);
  }

  public void efetuarRecargaCartao(Cartao cartao) {
      cartoes.efetuarRecargaCartao(cartao);
  }
}
