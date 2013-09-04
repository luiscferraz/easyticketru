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
    
    public CadastroAlunos(RepositorioAlunos repositorioAlunos){
        this.alunos = repositorioAlunos;
    }
    
    public void inserir(Refeicao refeicao){
        refeicoes.inserir(refeicao);
    }
    public boolean existe(String descricaoRefeicao){
        return alunos.existe(descricaoRefeicao);
    }
    public void atualizar(Refeicao refeicao){
        refeicoes.atualizar(refeicao);
    }
    public Refeicao procurarPorDescricao(String descricao){
        return refeicoes.procurarPorDescricao(descricao);
    }
    public void deletar(Int idRefeicao){
        refeicoes.deletar(idRefeicao);
    }
    
    public List<Refeicao> listarRefeicoes(){
        return refeicoes.listarRefeicoes();
    }
}
