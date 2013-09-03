/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Date;
import negocio.Aluno;

/**
 *
 * @author Nanda
 */
public class TesteAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Allan");
        aluno.setCpf("806.384.575-72");
        aluno.setEmail("allanamaral@gmail.com");
        aluno.setTelefone("(81)9988-3454");
        
        
        String d = "12/08/2013"
        Date.parse(d);       
        Date dataNasc = new Date(d);
        
        System.out.println(d);
    }
}
