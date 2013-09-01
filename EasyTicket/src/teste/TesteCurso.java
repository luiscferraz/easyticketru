/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dados.RepositorioCursos;
import gui.TelaAlunos;
import gui.TelaCargos;
import gui.TelaCursos;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import negocio.Curso;
import util.Formatacao;
import util.Validacao;

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
        
        //TelaCursos tela = new TelaCursos();
        //tela.setVisible(true);
        
        //Curso curso = new Curso();
        //System.out.println(repositorio.procurarPorNome("Odontologia"));
        //System.out.println(repositorio.findIdByNome("Odontologia"));
        
        //TelaCargos tela = new TelaCargos();
        //tela.setVisible(true);
        
        String d = "08/12/2013";
        Date.parse(d);       
        Date dataNasc = new Date(d);
        dataNasc.toString();
        
        System.out.println(d);
        //System.out.println(dataNasc);
        
        //Date d1 = new Date(); 
        //Calendar c = Calendar.getInstance(); 
        //c.setTime(d1); 
        
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT); 
        //System.out.println( df.format(c.getTime()) );
        
        System.out.println(df.format(dataNasc));
        System.out.println(Formatacao.formatarData(dataNasc));
        
        Date dataTransformada = Formatacao.transformarEmData(d);
        System.out.println(dataTransformada);
        
        
       
        
        
 
        

        
    }
}

        