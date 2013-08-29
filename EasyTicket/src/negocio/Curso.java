/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Nanda
 */
public class Curso {
    
    private int idCurso;
    private String nome;
    
    public Curso(){
    }
    
    public Curso(String nome){
        this.nome = nome;        
    }
    
    public Curso(int idCurso,String nome){
        this.idCurso = idCurso;
        this.nome = nome;        
    }

    /**
     * @return the idCurso
     */
    public int getIdCurso() {
        return idCurso;
    }

    /**
     * @param idCurso the idCurso to set
     */
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
}
