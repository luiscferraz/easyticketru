/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dados.RepositorioRecargas;

/**
 *
 * @author Nanda
 */
public class CadastroRecargas {
    
    private RepositorioRecargas recargas;
  
  public CadastroRecargas(RepositorioRecargas repositorioRecargas){
    this.recargas = repositorioRecargas;  
  }
  
  public void cadastrar(Recarga recarga){
    recargas.inserir(recarga);
  }
    
}
