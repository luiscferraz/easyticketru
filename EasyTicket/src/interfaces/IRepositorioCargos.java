/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import negocio.Cargo;

/**
 *
 * @author Nanda
 */
public interface IRepositorioCargos {
    public void inserir(Cargo cargo);
    public boolean existe(int idCargo);
    public void atualizar(Cargo cargo);
    public Cargo procurarPorId(int idCargo);
    public void deletar(int idCargo);
    public List<Cargo> listarCargos(); 
}
