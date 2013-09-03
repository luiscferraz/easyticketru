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
    //definir as condições para ver se um aluno(verificar por CPF) já tem um cartão cadstrado.
  }
  
  //definir os outros métodos para ativa, desetiva e bloquear um cartão. É preciso também a emissão de saldo do mesmo.
  
  //fazer esses outros métodos após a definição da classe de repositório.
  
  public Cartao buscaPorNumero(int numeroCartao){
    return cartoes.procurarPorNumero(numeroCartao);
  }
  
  public List<Cartao> listarCartoes(){
        return cartoes.listarCartoes();
    }
  
  public Cartao buscaPorCpf(int cpf){
    return cartoes.procurarPorCpf(cpf);
  }
  
  public boolean verificaExistenciaIdAluno(int idAluno){
        return alunos.existeCartaoAluno(idAluno);
  }
  
    
}
