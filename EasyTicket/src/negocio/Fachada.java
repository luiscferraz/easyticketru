/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dados.RepositorioCartoes;
import dados.RepositorioCursos;
import dados.RepositorioRefeicoes;

/**
 *
 * @author Nanda
 */
public class Fachada {

  private static Fachada instancia;
  private CadastroCartoes cadastroCartoes;
  //private CadastroRefeicoes cadastroRefeicoes;
  private CadastroCursos cadastroCursos;
  
  
  //verifica se já existe um,a instancia da fachada em funcionamento
  private static Fachada obterInstancia(){
    if(instancia == null){
      instancia = new Fachada();
    }
    return instancia;
  }
  
  //contrutor da fachada que determina que a mesma é iniciada já com todas as funções de cadastro
  private Fachada(){
    initCadastros();
  }
    
  //método que irá instanciar todas as classes de cadastro e de repositório para que será utilizado pela fachada  
  private void initCadastros(){
    
    RepositorioCartoes repositorioCartoes = new RepositorioCartoes();
    cadastroCartoes = new CadastroCartoes(repositorioCartoes);
  
    RepositorioCursos repositorioCursos = new RepositorioCursos();
    cadastroCursos = new CadastroCursos(repositorioCursos);
    
  }
  
  
  //definindo todos os métodos que estarão disponíveis para um cartão através da fachada.
  public void cadastrarCartao(Cartao cartao){
    cadastroCartoes.cadastrar(cartao);
  }
    
  public void atualizarCartao(Cartao cartao){
    cadastroCartoes.atualizar(cartao);  
  }
  
  public Cartao buscaCartaoPorNumero(int numeroCartao){
    return cadastroCartoes.buscaPorNumero(numeroCartao);
  }
  
  public Cartao buscaCartaoPorCpf(int cpf){
    return cadastroCartoes.buscaPorCpf(cpf);
    
  }
  
  
  //curso
  public void cadastrarCurso(Curso curso){
    cadastroCursos.cadastrar(curso);
  }
    
  public void atualizarCurso(Curso curso){
    cadastroCursos.atualizar(curso);  
  }
  
  public Curso buscaCursoPorId(int idCurso){
    return cadastroCursos.buscaPorId(idCurso);
  }
  
  
  

    
}
