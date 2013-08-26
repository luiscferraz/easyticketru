/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dados.RepositorioCursos;
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
        Curso curso = new Curso("Engenharia de Pesca");
        
        RepositorioCursos repositorio = new RepositorioCursos();
        
        repositorio.inserir(curso);
        
    }
}
