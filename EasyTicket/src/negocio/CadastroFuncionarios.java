/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dados.RepositorioFuncionarios;
import java.util.ArrayList;

/**
 *
 * @author Nanda
 */
public class CadastroFuncionarios {
    
    private RepositorioFuncionarios funcionarios;
    
    public CadastroFuncionarios(RepositorioFuncionarios repositorioFuncionarios){
        this.funcionarios = repositorioFuncionarios;
    }
    
    public void inserir(Funcionario funcionario){
        funcionarios.inserir(funcionario);
    }
    public boolean existe(String cpf){
        return funcionarios.existe(cpf);
    }
    public void atualizar(Funcionario funcionario){
        funcionarios.atualizar(funcionario);
    }
    public Funcionario procurarPorCpf(String cpfFuncionario){
        return funcionarios.procurarPorCpf(cpfFuncionario);
    }
    public void deletar(String cpfFuncionario){
        funcionarios.deletar(cpfFuncionario);
    }
    public ArrayList<Funcionario> buscarPorCargo(int idCargo){
        return funcionarios.buscarPorCargo(idCargo);
    }
    
}
