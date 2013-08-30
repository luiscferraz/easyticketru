/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Nanda
 */
public class Cargo {

    private int idCargo;
    private String nome;
    
    public Cargo(String nome){
        this.nome = nome;        
    }
    
    public Cargo(int idCargo,String nome){
        this.idCargo = idCargo;
        this.nome = nome;        
    }

    
    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String toString(Cargo cargo){
        int id = cargo.getIdCargo();
        String nome = cargo.getNome();
        
        String str = "Id:"+id+" Nome:"+nome;
        
        return str;
        
    }

}