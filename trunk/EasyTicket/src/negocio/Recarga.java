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
public class Recarga {
    private int idRecarga;
    private float valor;
    private Date dataRecarga;
    private int idCartao;
    
    public Recarga(int idRecarga,float valor, Date dataRecarga, int idCartao){
        this.idRecarga = idRecarga;
        this.valor = valor;
        this.dataRecarga = dataRecarga;
        this.idCartao = idCartao;
    }

    /**
     * @return the idRecarga
     */
    public int getIdRecarga() {
        return idRecarga;
    }

    /**
     * @param idRecarga the idRecarga to set
     */
    public void setIdRecarga(int idRecarga) {
        this.idRecarga = idRecarga;
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
     * @return the dataRecarga
     */
    public Date getDataRecarga() {
        return dataRecarga;
    }

    /**
     * @param dataRecarga the dataRecarga to set
     */
    public void setDataRecarga(Date dataRecarga) {
        this.dataRecarga = dataRecarga;
    }
    
    public void efetuarRecarga(Cartao cartao){
        if (cartao.isAtivo(cartao)){
            cartao.setSaldo(cartao.getSaldo()+this.valor);
        }
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
    
    
    
    
    
    
}