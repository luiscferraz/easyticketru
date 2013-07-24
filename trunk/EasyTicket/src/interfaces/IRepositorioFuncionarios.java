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
    public boolean existe(Funcionario funcionario);
    public void atualizar(Funcionario funcionario);
    public Funcionario procurarPorCpf(int cpfFuncionario);
    public ArrayList<Funcionario> buscarPorCargo(String cargoFuncionario);
    
}
