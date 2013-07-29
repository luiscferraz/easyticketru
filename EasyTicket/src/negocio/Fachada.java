/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Nanda
 */
public class Fachada {

  private static Fachada instancia;
  private CadastroCartoes cartoes;
  private CadastroRefeicoes refeicoes;
  
  
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
    cadastroCartoes = new CadastroCartoes(repCartoes);
  
    RepositorioRefeicoes repositorioRefeicoes = new RepositorioRefeicoes();
    cadastroRefeicoes = new CadastroRefeicoes(repositorioRefeicoes);
  
    RepositorioCursos repositorioCursos = new RepositorioCursos();
    cadastroCursos = new CadastroCursos(repositorioCursos);
    
  }
  
  
  //definindo todos os métodos que estarão disponíveis para um cartão através da fachada.
  public void cadastrarCartao(Cartao cartao){
    cartoes.cadastrar(cartao);
  }
    
  public void atualizarCartao(Cartao cartao){
    cartoes.atualizar(cartao);  
  }
  
  public Cartao buscaCartaoPorNumero(int numeroCartao){
    cartoes.buscaPorNumero(numeroCartao);
  }
  
  public Cartao buscaCartaoPorCpf(int cpf){
    cartoes.buscaPorCpf(cpf);
    
  }
  

    
}
