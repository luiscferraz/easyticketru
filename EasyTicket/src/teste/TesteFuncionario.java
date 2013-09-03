/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dados.RepositorioFuncionarios;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import negocio.Funcionario;


/**
 *
 * @author Marcela Domingues
 */
public class TesteFuncionario {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario funcionario = new Funcionario();
        
        RepositorioFuncionarios repositorio = new RepositorioFuncionarios();
        
        repositorio.inserir(funcionario);
        
        
 
    }
    
}
