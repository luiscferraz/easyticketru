/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import java.util.Date;
import negocio.Pagamento;

/**
 *
 * @author Marcela
 */
public interface IRepositorioPagamentos {
    
    public void inserir(Pagamento pagamento);
    public boolean existe(int idPagamento);
    public void atualizar(Pagamento pagamento);
    public Pagamento procurarPorId(int idPagamento);
    public ArrayList<Pagamento> buscarPorCartao(int idCartao);
    public ArrayList<Pagamento> buscarPorData(Date data);
    
}
