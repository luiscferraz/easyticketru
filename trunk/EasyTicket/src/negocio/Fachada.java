/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dados.RepositorioAlunos;
import dados.RepositorioCargos;
import dados.RepositorioCartoes;
import dados.RepositorioCursos;
import dados.RepositorioFuncionarios;
import dados.RepositorioRecargas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nanda
 */
public class Fachada {

  private static Fachada instancia;
  private CadastroCursos cadastroCursos;
  private CadastroCargos cadastroCargos;
  private CadastroAlunos cadastroAlunos;
  private CadastroFuncionarios cadastroFuncionarios;
  private CadastroRecargas cadastroRecargas;

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
    
    RepositorioAlunos repositorioAlunos = new RepositorioAlunos();
    cadastroAlunos = new CadastroAlunos(repositorioAlunos);
    
    RepositorioFuncionarios repositorioFuncionarios = new RepositorioFuncionarios();
    cadastroFuncionarios = new CadastroFuncionarios(repositorioFuncionarios);
    
    RepositorioRecargas repositorioRecargas = new RepositorioRecargas();
    cadastroRecargas = new CadastroRecargas(repositorioRecargas);
    
    
    
    
  
    
    
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
    public int findIdCursoByNome(String nome){
        return cadastroCursos.findIdByNome(nome);
    }
    
    
    //Cargo
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
    public Cargo procurarPorIdCargo(int idCargo){
        return cadastroCargos.buscaPorId(idCargo);
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
    public int findIdCargoByNome(String nome){
        return cadastroCargos.findIdByNome(nome);
    }
    
    //Aluno
    public void cadastrarAluno(Aluno aluno){
        cadastroAlunos.inserir(aluno);
    }
    public boolean verificarExistenciaAlunoPorCpf(String cpf){
        return cadastroAlunos.existe(cpf);
    }
    public void atualizarAluno(Aluno aluno){
        cadastroAlunos.atualizar(aluno);
    }
    public Aluno findAlunoByCpf(String cpfAluno){
        return cadastroAlunos.procurarPorCpf(cpfAluno);
    }
    public void deletarAluno(String cpfAluno){
        cadastroAlunos.deletar(cpfAluno);
    }
    public ArrayList<Aluno> findAlunosByCurso(int idCurso){
        return cadastroAlunos.buscarPorCurso(idCurso);
    }    
    public List<Aluno> listarAlunos(){
        return cadastroAlunos.listarAlunos();
    }
    
    
    //Funcionario
    public void cadastrarFuncionario(Funcionario funcionario){
        cadastroFuncionarios.inserir(funcionario);
    }
    public boolean verificarExistenciaFuncionarioPorCpf(String cpf){
        return cadastroFuncionarios.existe(cpf);
    }
    public void atualizarFuncionario(Funcionario funcionario){
        cadastroFuncionarios.atualizar(funcionario);
    }
    public Funcionario findFuncionarioByCpf(String cpfFuncionario){
        return cadastroFuncionarios.procurarPorCpf(cpfFuncionario);
    }
    public void deletarFuncionario(String cpfFuncionario){
        cadastroFuncionarios.deletar(cpfFuncionario);
    }
    public ArrayList<Funcionario> findFuncionariosByCargo(int idCargo){
        return cadastroFuncionarios.buscarPorCargo(idCargo);
    }
    
    //cartão
    public void cadastrarCartao(Cartao cartao){
        cadastroCartoes.cadastrar(cartao);
    }
    public boolean verificarExistenciaCartaoPorNumero(int numeroCartao){
        return cadastroCartoes.verificaExistenciaCartaoByNumero(numeroCartao);
    }
    public void atualizarCartao(Cartao cartao){
        cadastroCartoes.atualizar(cartao);
    }
    public Cartao findCartaoByNumero(int numeroCartao){
        return cadastroCartoes.buscaCartaoPorNumero(numeroCartao);
    }
    
    public void efetuarRecargaCartao(Cartao cartao) {
        cadastroCartoes.efetuarRecargaCartao(cartao);
    }
    
    public Cartao findCartaoByCpf(String cpf){
        return cadastroCartoes.buscaPorCpf(cpf);
    }
    
  
   //recarga
    public void cadastrarRecarga(Recarga recarga){
        cadastroRecargas.cadastrar(recarga);
    }
  

    
}
