/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import interfaces.IRepositorioAlunos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.Aluno;
import negocio.EnumStatusAluno;

/**
 *
 * @author Nanda
 */
public class RepositorioAlunos implements IRepositorioAlunos {
    
    private Connection conexao;
    
    public RepositorioAlunos(){
        try {
            this.conexao = GenericDAO.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void inserir(Aluno aluno){
        String query = "INSERT INTO EASYTICKET.ALUNOS"+
                " (NOMEALUNO,CPFALUNO,EMAILALUNO,TELEFONEALUNO,DATANASCIMENTO,"+
                "STATUSALUNO,INICIOCURSOALUNO,TERMINOCURSOALUNO)"+
                "VALUES (?) (?) (?) (?) (?) (?) (?) (?)" ;
        
       
            try {
                PreparedStatement stmt = this.conexao.prepareStatement(query);

                stmt.setString(1, aluno.getNome());
                stmt.setString(2, aluno.getCpf());
                stmt.setString(3, aluno.getEmail());
                stmt.setString(4, aluno.getTelefone());
                stmt.setDate(5, (Date) aluno.getDataNascimento());
                stmt.setString(6, aluno.getStatusAluno().toString());
                stmt.setDate(7, (Date) aluno.getInicioCursoAluno());
                stmt.setDate(8, (Date) aluno.getTerminoCursoAluno());

                stmt.execute();

                //conexao.close();
                System.out.println("Curso inserido com sucesso.");
            } catch (SQLException ex) {
                System.out.println("incluirAluno(): "+ex.toString());
            } 
        
    }

    
    public boolean existe(String cpfAluno) {
        if (this.procurarPorCpf(cpfAluno)!=null){
          return true;
        }else{
          return false;
        }
    }

    
    public void atualizar(Aluno aluno) {
      String query = "UPDATE EASYTICKET.ALUNOS SET NOMEALUNO=?"
                                                   "CPFALUNO,"+
                                                   "EMAILALUNO,"+
                                                   "TELEFONEALUNO,"+
                                                   "DATANASCIMENTO,"+
                                                   "STATUSALUNO,"+
                                                   "INICIOCURSOALUNO,"+
                                                   "TERMINOCURSOALUNO"+
                                                   " WHERE CPFALUNO=?";
       
      try{
         PreparedStatement stmt = this.conexao.prepareStatement(query);
         
         stmt.setString(1,aluno.getNome());
         stmt.execute();
         
         //conexao.close();
         System.out.println("Aluno atualizado com sucesso");
      
      } catch (SQLException ex) {
                 System.out.println("atualizarAluno(): "+ex.toString());
      }
    }

    
    public Aluno procurarPorCpf(int cpfAluno) {
        Aluno alunoResultado = null;
        
        String query = "SELECT * FROM EASYTICKET.ALUNOS WHERE CPFALUNO= "+cpfAluno;
        
        try {
                 
                 PreparedStatement stmt = this.conexao.prepareStatement(query);
                 ResultSet res = stmt.executeQuery();
                 
                 if (res.next()) {
                     alunoResultado = new Curso();
                     alunoResultado.setIdAluno(res.getInt(1));
                     alunoResultado.setNome(res.getString(2));
                     alunoResultado.setCpf(res.getString(3));
                     alunoResultado.setEmail(res.getString(4));
                     alunoResultado.setTelefone(res.getString(5));
                     //alunoResultado.setDate(res.getDate(6));
                     alunoResultado.setStatusAluno(res.getString(7));
                     //alunoResultado.setInicioCursoAluno(res.getDate(8));
                     //alunoResultado.setTerminoCursoAluno(res.getDate(9));
                     alunoResultado.setIdCurso(res.getInt(10));
                                     
                 }
                 //conexao.close();                
                                  
         } catch (SQLException ex) {
                 System.out.println("procurarAlunoPorCpf: "+ex.toString());
         }
        
         return alunoResultado;
    }

    @Override
    public ArrayList<Aluno> buscarPorCurso(int idCurso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void deletar(String cpfAluno) {
        
        String query = "DELETE FROM EASYTICKET.ALUNOS WHERE CPFALUNO= "+cpfAluno;
        
        try {
                 PreparedStatement stmt = this.conexao.prepareStatement(query);
                
                 if(this.existe(cpfAluno)){
                     stmt.execute();
                     System.err.println("Aluno deletado com sucesso.");
                 }else{
                     System.out.println("Aluno inexistente.");
                 }
                 //conexao.close();
                                  
         } catch (SQLException ex) {
                 System.out.println("deletarAluno(): "+ex.toString());
         }
    }
    
}
