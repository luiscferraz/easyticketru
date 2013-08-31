/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dados.RepositorioCargos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import negocio.Cargo;

/**
 *
 * @author Marcela Domingues
 */
public class TesteCargo {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Cargo cargo = new Cargo("Atendente");
        
        RepositorioCargos repositorio = new RepositorioCargos();
        
        //repositorio.inserir(cargo);
        
        //buscando um cargo passando o idCargo
        //Cargo cargo2 = new Cargo();
        //cargo2 = repositorio.procurarPorId(1);
        //System.out.println(cargo2.getIdCargo());
        //System.out.println(cargo2.getNome());
       
        //atualizando um cargo
        //cargo2.setNome("Atendente");
        //repositorio.atualizar(cargo2);
        
        repositorio.deletar(1);
        
        
       /**for(Cargo c: repositorio.listarCargos()){
           System.out.println(c.toString(c));
       }
       **/
 
        
        //System.out.println(repositorio.procurarPorNome("Odontologia"));
        //System.out.println(repositorio.findIdByNome("Odontologia"));
        
        
 
    }
    
}
