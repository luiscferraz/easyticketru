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
        
        repositorio.deletar(2);
        

        
    }
}
