/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Date;

/**
 *
 * @author Marcela
 */
public class Funcionario extends Pessoa {
    
    private int idCargo;
    private String statusFuncionario;
    
    public Funcionario(String nome, String email, String cpf, String telefone,
            java.sql.Date dataNascimento, int idCargo, String statusFuncionario){
        
        super(nome, email, cpf, telefone, dataNascimento);
        this.idCargo = idCargo;
        this.statusFuncionario = statusFuncionario;
       
    }
    
    public Funcionario(){}

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getStatusFuncionario() {
        return statusFuncionario;
    }

    public void setStatusFuncionario(String statusFuncionario) {
        this.statusFuncionario = statusFuncionario;
    }
    
    public Boolean isAtivo(Funcionario funcionario){
        if (this.statusFuncionario == "ATIVO"){
            return true;
        }else{
            return false;
        }
       
    }
    
}
