/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import negocio.Pagamento;

/**
 *
 * @author Marcela
 */
public interface IRepositorioPagamentos {
    
    public void inserir(Pagamento pagamento);
    public boolean existe(Pagamento pagamento);
    public void atualizar(Pagamento pagamento);
    public Pagamento procurarPorId(int idPagamento);
    
}
