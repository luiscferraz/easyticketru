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
  RepositorioCartoes repositorioCartoes = new RepositorioCartoes();
  cadastroCartoes = new CadastroCartoes(repCartoes);
  
  RepositorioRefeicoes repositorioRefeicoes = new RepositorioRefeicoes();
  cadastroRefeicoes = new CadastroRefeicoes(repositorioRefeicoes);
  
  RepositorioCursos repositorioCursos = new RepositorioCursos();
  cadastroCursos = new CadastroCursos(repositorioCursos);
    
}
