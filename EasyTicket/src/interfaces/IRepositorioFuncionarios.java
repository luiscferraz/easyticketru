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
    public boolean existe(String cpf);
    public void atualizar(Funcionario funcionario);
    public Funcionario PorCpf(String cpfFuncionario);
    public void deletar(String cpfFuncionario);
    public ArrayList<Funcionario> buscarPorCargo(int idCargo);
    
}
