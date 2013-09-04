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
    private int numCartao;
    private float saldo;
    private String status;
    private String cpfAlunoCartao;
    
    public Cartao(int numCartao,String cpfAlunoCartao, String status){
        this.numCartao = numCartao;
        this.status = status;
        this.saldo=0;   
        this.cpfAlunoCartao = cpfAlunoCartao;
    }
    
    public Cartao(){}

    /**
     * @return the idCartao
     */
    public int getNumCartao() {
        return numCartao;
    }

    /**
     * @param idCartao the idCartao to set
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
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
    * @return the cpfAluno
    */
    public String getCpfAlunoCartao() {
        return cpfAlunoCartao;
    }

    /**
     * @param cpfAluno the cpfAluno to set
     */
    public void setCPFAlunoCartao(String cpfAlunoCartao) {
        this.cpfAlunoCartao = cpfAlunoCartao;
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
        if(cartao.getStatus()== "ATIVO"){
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
        cartao.status = "INATIVO";        
    }
    
    /**
     * Método responsável pela ativação de um cartão
     * @param cartao 
     */
    public void ativarCartao(Cartao cartao){
        cartao.status = "ATIVO";
    }
    
    /**
     * Método responsável pelo bloqueio de um cartão
     * @param cartao 
     */
    public void bloquearCartao(Cartao cartao){
        cartao.status = "BLOQUEADO";
    }


    
    
}
