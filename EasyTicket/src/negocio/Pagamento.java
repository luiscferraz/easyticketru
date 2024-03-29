/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Date;

/**
 *
 * @author Nanda
 */
public class Pagamento {
    private int idPagamento;
    private Date dataPagamento;
    private float valor;
    private int idCartao;
    
    public Pagamento(int idPagamento, Date dataPagamento,float valor, int idCartao){
        this.idPagamento = idPagamento;
        this.dataPagamento = dataPagamento;
        this.valor = valor;
        this.idCartao = idCartao;
    }

    /**
     * @return the idPagamento
     */
    public int getIdPagamento() {
        return idPagamento;
    }

    /**
     * @param idPagamento the idPagamento to set
     */
    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    /**
     * @return the dataPagamento
     */
    public Date getDataPagamento() {
        return dataPagamento;
    }

    /**
     * @param dataPagamento the dataPagamento to set
     */
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
    

    /**
     * @return the idCartao
     */
    public int getIdCartao() {
        return idCartao;
    }

    /**
     * @param idCartao the idCartao to set
     */
    public void setIdCartao(int idCartao) {
        this.idCartao = idCartao;
    }
    
    
    
    public void efetuarPagamento(Cartao cartao){
        if((cartao.isAtivo(cartao)) && (cartao.getSaldo()>= this.valor)){
            cartao.setSaldo(cartao.getSaldo()-this.getValor());
        }
    }
    
    
    
    
    
    
    
}


