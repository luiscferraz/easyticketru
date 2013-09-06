/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import negocio.Cartao;

/**
 *
 * @author Nanda
 */
public interface IRepositorioCartoes {
    
    public void inserir(Cartao cartao);
    public boolean existe(int numeroCartao);
    public void atualizar(Cartao cartao);
    public Cartao procurarPorNumero(int numeroCartao);
    public Cartao procurarPorCpf(String cpf); 
    public void efetuarRecargaCartao(Cartao cartao);
 }
