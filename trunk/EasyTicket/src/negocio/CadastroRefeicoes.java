/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dados.RepositorioRefeicoes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nanda
 */
public class CadastroRefeicoes {
    private RepositorioRefeicoes refeicoes;
    
    public CadastroRefeicoes(RepositorioRefeicoes repositorioRefeicoes){
        this.refeicoes= repositorioRefeicoes;
    }
    
    public void inserir(Refeicao refeicao){
        refeicoes.inserir(refeicao);
    }
    public boolean existe(String descricaoRefeicao){
        return refeicoes.existe(descricaoRefeicao);
    }
    public void atualizar(Refeicao refeicao){
        refeicoes.atualizar(refeicao);
    }
    public Refeicao procurarPorDescricao(String descricao){
        return refeicoes.procurarPorDescricao(descricao);
    }
    public void deletar(int idRefeicao){
        refeicoes.deletar(idRefeicao);
    }
    
    public List<Refeicao> listarRefeicoes(){
        return refeicoes.listarRefeicoes();
    }
}
