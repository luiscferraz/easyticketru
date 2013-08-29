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
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.Curso;
import negocio.EnumStatusAluno;


/**
 *
 * @author Nanda
 */
public class RepositorioCursos implements IRepositorioCursos {
    
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
            
            conexao.close();
            
        } catch (SQLException ex) {
            System.out.println("incluirCurso(): "+ex.toString());
        } 
    
    }

    @Override
    public boolean existe(int idCurso) {
        
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        
    }

    
    public void atualizar(Curso curso) {
       String query = "UPDATE EASYTICKET.CURSOS SET NOME=? WHERE IDCURSOS=?";
       
      try{
         PreparedStatement stmt = this.conexao.prepareStatement(query);
         
         stmt.setString(1,curso.getNome());
         stmt.execute();
         
         conexao.close();
      
      } catch (SQLException e) {
                 e.printStackTrace();
      }
    }

    
    
    
    public Curso procurarPorId(int idCurso) {
        Curso cursoResultado = null;
        
        String query = "SELECT * FROM EASYTICKET.CURSOS WHERE IDCURSOS= "+idCurso;
        
        try {
                 
                 PreparedStatement stmt = this.conexao.prepareStatement(query);
                 ResultSet res = stmt.executeQuery();
                 
                 if (res.next()) {
                     cargoResultado = newResultado();
                     cargoResultado.setIdCurso(res.getInt(1));
                     cargoResultado.setNome(res.getString(2));
                     System.out.println(res.getInt(1));
                     System.out.println(res.getString(2)); 
                 }
                 conexao.close();                
                                  
         } catch (SQLException e) {
                 e.printStackTrace();
         }
        
         return cursoResultado;

    
    }

    
    public void deletar(int idCurso) {
        
        String query = "DELETE * FROM EASYTICKET.CURSOS WHERE IDCURSOS= "+idCurso;
        
        try {
                 
                 PreparedStatement stmt = this.conexao.prepareStatement(query);
                 stmt.setInt(1, idCurso);
                 stmt.execute();
                 conexao.close();                               
                                  
         } catch (SQLException e) {
                 e.printStackTrace();
         }
        
         return cursoResultado;
    }
    
}

