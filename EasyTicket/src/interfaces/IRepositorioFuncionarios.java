/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import negocio.Funcionario;

/**
 *
 * @author Marcela Domingues
 */
public interface IRepositorioFuncionarios {
    
    public void inserir(Funcionario funcionario);
    public boolean existe(int cpf);
    public void atualizar(Funcionario funcionario);
    public Funcionario procurarPorCpf(int cpf);
    public ArrayList<Funcionario> buscarPorCargo(String cargoFuncionario);
    
}
