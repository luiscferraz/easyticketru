/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dados.RepositorioCargos;
import dados.RepositorioCartoes;
import dados.RepositorioCursos;
import dados.RepositorioRefeicoes;
import java.util.List;

/**
 *
 * @author Nanda
 */
public class Fachada {

  private static Fachada instancia;
  private CadastroCursos cadastroCursos;
  private CadastroCargos cadastroCargos;

  private CadastroCartoes cadastroCartoes;

  
  
  //verifica se já existe um,a instancia da fachada em funcionamento
  public static Fachada obterInstancia(){
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
    RepositorioCursos repositorioCursos = new RepositorioCursos();
    cadastroCursos = new CadastroCursos(repositorioCursos);
    
    RepositorioCargos repositorioCargos = new RepositorioCargos();
    cadastroCargos = new CadastroCargos(repositorioCargos);
    
    RepositorioCartoes repositorioCartoes = new RepositorioCartoes();
    cadastroCartoes = new CadastroCartoes(repositorioCartoes);
  
    
    
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
    public void inserirCurso(Curso curso){
        cadastroCursos.cadastrar(curso);
    }
    public boolean verificaExistenciaCursoPorId(int idCurso){
        return cadastroCursos.verificaExistenciaId(idCurso);
      
    }
    public boolean VerificaNomeExistenteCurso(String nomeCurso){
        return cadastroCursos.verificaExistenciaNome(nomeCurso);
    }
    public void atualizarCurso(Curso curso){
        cadastroCursos.atualizar(curso);
    }
    public Curso procurarPorIdCurso(int idCurso){
        return cadastroCursos.buscaPorId(idCurso);
    }    
    public void deletarCurso(int idCurso){
        cadastroCursos.deletar(idCurso);
    }
    public List<Curso> listarCursos(){
        return cadastroCursos.listarCursos();
    }
    
    
   //Cargos
    public void atualizarCargo(Cargo cargo){
        cadastroCargos.atualizar(cargo);  
    }
    
    public void cadastrarCargo(Cargo cargo){
        cadastroCargos.cadastrar(cargo);
    }
    
    public Cargo buscaCargoPorId(int idCargo){
        return cadastroCargos.buscaPorId(idCargo);
    }
    
    public List<Cargo> listarCargos(){
        return cadastroCargos.listarCargos();
    }
    
    public boolean verificarExistenciaNomeCargo(String nomeCargo){
        return cadastroCargos.verificaExistenciaNome(nomeCargo);
    }
    
    public boolean verificarExistenciaIdCargo(int idCargo){
        return cadastroCargos.verificaExistenciaId(idCargo);
    }
    
    public void deletarCargo(int idCargo){
        cadastroCargos.deletar(idCargo);
    }
  
  
  

    
}
