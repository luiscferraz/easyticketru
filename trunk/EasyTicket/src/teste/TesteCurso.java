/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dados.RepositorioCursos;
import gui.TelaCursos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import negocio.Curso;

/**
 *
 * @author Nanda
 */
public class TesteCurso {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Curso curso = new Curso("Engenharia de Petróleo");
        
        RepositorioCursos repositorio = new RepositorioCursos();
        
        //repositorio.inserir(curso);
        
        //buscando um curso passando o idCurso
        //Curso curso2 = new Curso();
        //curso2 = repositorio.procurarPorId(2);
        //System.out.println(curso2.getIdCurso());
        //System.out.println(curso2.getNome());
       
        //atualizando um curso
        //curso2.setNome("Engenharia Civil");
        //repositorio.atualizar(curso2);
        
        //repositorio.deletar(2);
        
        
       /**for(Curso c: repositorio.listarCursos()){
           System.out.println(c.toString(c));
       }
       **/
        
        TelaCursos tela = new TelaCursos();
        tela.setVisible(true);
        
        //Curso curso = new Curso();
        //System.out.println(repositorio.procurarPorNome("Odontologia"));
        
        
 
        

        
    }
}
