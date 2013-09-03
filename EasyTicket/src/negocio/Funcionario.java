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
    
    private String cargo;
    private String statusFuncionario;
    
    public Funcionario(String nome, String email, String cpf, String telefone,
            java.sql.Date dataNascimento, String cargo, String statusFuncionario){
        
        super(nome, email, cpf, telefone, dataNascimento);
        this.cargo = cargo;
        this.statusFuncionario = statusFuncionario;
       
    }
    
    public Funcionario(){}

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
