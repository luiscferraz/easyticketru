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
public class Funcionario extends Pessoa {
    
    private String cargo;
    private EnumStatusFuncionario statusFuncionario;
    
    public Funcionario(String nome, String email, int cpf, int telefone, Date dataNascimento, String cargo, 
                        EnumStatusFuncionario statusFuncionario){
        
        super(nome, email, cpf, telefone, dataNascimento);
        this.cargo = cargo;
        this.statusFuncionario = statusFuncionario;
       
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public EnumStatusFuncionario getStatusFuncionario() {
        return statusFuncionario;
    }

    public void setStatusFuncionario(EnumStatusFuncionario statusFuncionario) {
        this.statusFuncionario = statusFuncionario;
    }
    
    public Boolean isAtivo(Funcionario funcionario){
        if (this.statusFuncionario == EnumStatusFuncionario.ATIVO){
            return true;
        }else{
            return false;
        }
       
    }
    
}
