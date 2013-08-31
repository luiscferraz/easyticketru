package dados;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import interfaces.IRepositorioCursos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.Curso;
import negocio.EnumStatusAluno;


/**
 *
 * @author Nanda
 */
public class RepositorioCursos extends GenericDAO implements IRepositorioCursos  {
    
    private Connection conexao;
    
    public RepositorioCursos(){
        try {
            this.conexao = GenericDAO.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public void inserir(Curso curso) {
        String query = "INSERT INTO EASYTICKET.CURSOS (NOMECURSO) VALUES (?)" ;
        
       
            try {
                PreparedStatement stmt = this.conexao.prepareStatement(query);

                stmt.setString(1, curso.getNome());

                stmt.execute();

                //conexao.close();
                System.out.println("Curso inserido com sucesso.");
            } catch (SQLException ex) {
                System.out.println("incluirCurso(): "+ex.toString());
            } 
    }

    
    public boolean existe(int idCurso) {
      if (this.procurarPorId(idCurso)!=null){
          return true;
      }else{
          return false;
      }
    }
    
   
    public void atualizar(Curso curso) {
       String query = "UPDATE EASYTICKET.CURSOS SET NOMECURSO=? WHERE IDCURSO=?";
       
      try{
         PreparedStatement stmt = this.conexao.prepareStatement(query);
         
         stmt.setString(1,curso.getNome());
         stmt.setInt(2, curso.getIdCurso());
         stmt.execute();
         
         //conexao.close();
         System.out.println("Curso atualizado com sucesso");
      
      } catch (SQLException ex) {
                 System.out.println("atualizarCurso(): "+ex.toString());
      }
    }

 
    
    public Curso procurarPorId(int idCurso) {
        Curso cursoResultado = null;
        
        String query = "SELECT * FROM EASYTICKET.CURSOS WHERE IDCURSO= "+idCurso;
        
        try {
                 
                 PreparedStatement stmt = this.conexao.prepareStatement(query);
                 ResultSet res = stmt.executeQuery();
                 
                 if (res.next()) {
                     cursoResultado = new Curso();
                     cursoResultado.setIdCurso(res.getInt(1));
                     cursoResultado.setNome(res.getString(2));
                     //System.out.println(res.getInt(1));
                    // System.out.println(res.getString(2)); 
                 }
                 //conexao.close();                
                                  
         } catch (SQLException ex) {
                 System.out.println("procurarCursoPorId(): "+ex.toString());
         }
        
         return cursoResultado;
    }
    
    public int findIdByNome(String nomeCurso) {
        int idCurso=-1;
        
        String query = "SELECT IDCURSO FROM EASYTICKET.CURSOS WHERE NOMECURSO=?";
        
        try {                 
             PreparedStatement stmt = this.conexao.prepareStatement(query);
             stmt.setString(1, nomeCurso);
             ResultSet res = stmt.executeQuery();

             if (res.next()) {
                 idCurso = res.getInt(1);
                 //System.out.println(res.getInt(1));
                // System.out.println(res.getString(2)); 
             }
             //conexao.close();                
                                  
         } catch (SQLException ex) {
                 System.out.println("procurarCursoPorId(): "+ex.toString());
         }
        
         return idCurso;
    }
    
    
    public void deletar(int idCurso) {
        
        String query = "DELETE FROM EASYTICKET.CURSOS WHERE IDCURSO= "+idCurso;
        
        try {
                 PreparedStatement stmt = this.conexao.prepareStatement(query);
                
                 if(this.existe(idCurso)){
                     stmt.execute();
                     System.err.println("Curso deletado com sucesso.");
                 }else{
                     System.out.println("Curso inexistente.");
                 }
                 conexao.close();
                                  
         } catch (SQLException ex) {
                 System.out.println("deletarCurso(): "+ex.toString());
         }
    }
    
    
    public List<Curso> listarCursos(){
          
          List<Curso> listaCursos = new ArrayList<Curso>();

          String query = "SELECT * FROM EASYTICKET.CURSOS";

          try {

              PreparedStatement stmt = this.conexao.prepareStatement(query);
              ResultSet rs = stmt.executeQuery();

              while(rs.next()){
                  Curso curso = new Curso();
                  curso.setIdCurso(rs.getInt(1));
                  curso.setNome(rs.getString(2));

                  listaCursos.add(curso);
              }
              //conexao.close(); 

          }catch (SQLException ex) {

                  System.out.println("listarCursos(): "+ex.toString());

          }
          return listaCursos;
          
     }
    
}

