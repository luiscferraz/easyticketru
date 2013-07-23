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
    private int numCartao;
    private float saldo;
    private EnumStatusCartao status;
    
    public Cartao(int idCartao,int numCartao){
        this.idCartao = idCartao;
        this.numCartao = numCartao;
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
     * @return the numCartao
     */
    public int getNumCartao() {
        return numCartao;
    }

    /**
     * @param numCartao the numCartao to set
     */
    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
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
    
    public float emitirSaldo(Cartao cartao){
        return cartao.getSaldo();
    }
    
    public boolean isAtivo(Cartao cartao){
        if(cartao.getStatus()== EnumStatusCartao.ATIVO){
            return true;
        } else {
            return false;
        }
    }
    
    public void inativarCartao(Cartao cartao){
        this.status = EnumStatusCartao.INATIVO;        
    }
    
    public void ativarCartao(Cartao cartao){
        this.status = EnumStatusCartao.INATIVO;
    }
    
    public void bloquearCartao(Cartao cartao){
        this.status = EnumStatusCartao.BLOQUEADO;
    }
    
    
}
