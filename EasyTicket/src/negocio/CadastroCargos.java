/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dados.RepositorioCargos;
import java.util.List;

/**
 *
 * @author Nanda
 */
public class CadastroCargos {
    private RepositorioCargos cargos;
    
    public CadastroCargos(RepositorioCargos cargos){
        this.cargos = cargos;
    }
    
    public void atualizar(Cargo cargo){
        cargos.atualizar(cargo);  
    }
    
    public void cadastrar(Cargo cargo){
        cargos.inserir(cargo);
    }
    
    public Cargo buscaPorId(int idCargo){
        return cargos.procurarPorId(idCargo);
    }
    
    public List<Cargo> listarCargos(){
        return cargos.listarCargos();
    }
}
