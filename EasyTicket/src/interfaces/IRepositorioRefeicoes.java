/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import negocio.Refeicao;

/**
 *
 * @author Marcela
 */
public interface IRepositorioRefeicoes {
 
    public void inserir(Refeicao refeicao);
    public boolean existe(Refeicao refeicao);
    public void atualizar(Refeicao refeicao);
    public Refeicao procurarPorId(int idRefeicao);
    
}
