/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dados.RepositorioAlunos;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import negocio.Aluno;



/**
 *
 * @author Marcela Domingues
 */
public class TesteAluno {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno = new Aluno("Marcela", "marcela.domingues@gmail.com", "123.456.789-00", "9825-1598",
            1992-06-19, 3, "Ativo", 2011-03-15, 2015-12-15);
        
        RepositorioAlunos repositorio = new RepositorioAlunos();
        
        repositorio.inserir(aluno);
    
 
    }
    
    
}
