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

    @Override
    public void atualizar(Curso curso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Curso procurarPorId(int idCurso) {
        String query = "SELECT * FROM EASYTICKET.CURSOS WHERE IDCURSOS=?" ; 
        try {
                 
                 PreparedStatement stmt = this.conexao..prepareStatement(query);
                 stmt.setString(1, s);
                 ResultSet res = stmt.executeQuery();
                 if (res.next()) {
                     System.out.print(res.getInt(1));
                     System.out.print(res.getString(2));
                     
                 }
             } catch (SQLException e) {
                 e.printStackTrace();
             }
           
        }
    
}
