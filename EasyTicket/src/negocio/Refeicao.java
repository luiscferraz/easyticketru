/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Nanda
 */
public class Refeicao {
    private int idRefeicao;
    private EnumRefeicao descricao;
    private float valor;
    
    public Refeicao(float valor){
        this.valor = valor;        
    }

    /**
     * @return the idRefeicao
     */
    public int getIdRefeicao() {
        return idRefeicao;
    }

    /**
     * @param idRefeicao the idRefeicao to set
     */
    public void setIdRefeicao(int idRefeicao) {
        this.idRefeicao = idRefeicao;
    }

    /**
     * @return the descricao
     */
    public EnumRefeicao getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(EnumRefeicao descricao) {
        this.descricao = descricao;
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
    
    
    
}
