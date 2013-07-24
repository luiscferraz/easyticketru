/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Nanda
 */
public class Cartao {
    private int idCartao;
    private float saldo;
    private EnumStatusCartao status;
    
    public Cartao(int idCartao){
        this.idCartao = idCartao;
        this.status = EnumStatusCartao.ATIVO;
        this.saldo=0;       
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

   /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the status
     */
    public EnumStatusCartao getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(EnumStatusCartao status) {
        this.status = status;
    }
    
    /**
     * Método responsável pela emissão de saldo de um cartão
     * @param cartao
     * @return saldo
     */
    public float emitirSaldo(Cartao cartao){
        return cartao.getSaldo();
    }
    
    /**
     * Método que verifica se um cartão está ativo.
     * @param cartao
     * @return boolean
     */
    public boolean isAtivo(Cartao cartao){
        if(cartao.getStatus()== EnumStatusCartao.ATIVO){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Método responsável pela inativação de um cartão
     * @param cartao 
     */
    public void inativarCartao(Cartao cartao){
        this.status = EnumStatusCartao.INATIVO;        
    }
    
    /**
     * Método responsável pela ativação de um cartão
     * @param cartao 
     */
    public void ativarCartao(Cartao cartao){
        this.status = EnumStatusCartao.INATIVO;
    }
    
    /**
     * Método responsável pelo bloqueio de um cartão
     * @param cartao 
     */
    public void bloquearCartao(Cartao cartao){
        this.status = EnumStatusCartao.BLOQUEADO;
    }
    
    
}
