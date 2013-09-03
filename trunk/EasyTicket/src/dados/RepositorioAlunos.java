/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import interfaces.IRepositorioAlunos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.Aluno;
import negocio.EnumStatusAluno;
import util.Formatacao;

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
                                          " (NOMEALUNO,CPFALUNO,"+
                                            "EMAILALUNO,"+
                                            "TELEFONEALUNO,"+
                                            "DATANASCIMENTOALUNO,"+
                                            "STATUSALUNO,"+
                                            "INICIOCURSOALUNO,"+
                                            "TERMINOCURSOALUNO,IDCURSOALUNO)"+
                        "VALUES (?,?,?,?,?,?,?,?,?)" ;
        
       
            try {
                PreparedStatement stmt = this.conexao.prepareStatement(query);

                stmt.setString(1, aluno.getNome());
                stmt.setString(2, aluno.getCpf());
                stmt.setString(3, aluno.getEmail());                
                stmt.setString(4, aluno.getTelefone());
                stmt.setDate(5, aluno.getDataNascimento());
                stmt.setString(6, aluno.getStatusAluno());
                stmt.setDate(7, aluno.getInicioCursoAluno());
                stmt.setDate(8, aluno.getTerminoCursoAluno());
                stmt.setInt(9,aluno.getIdCurso());

                stmt.execute();

                //conexao.close();
                System.out.println("Aluno inserido com sucesso.");
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
      String query = "UPDATE EASYTICKET.ALUNOS SET NOMEALUNO=?,"+
                                                   "CPFALUNO=?,"+
                                                   "EMAILALUNO=?,"+
                                                   "TELEFONEALUNO=?,"+
                                                   "DATANASCIMENTOALUNO=?,"+
                                                   "STATUSALUNO=?,"+
                                                   "INICIOCURSOALUNO=?,"+
                                                   "TERMINOCURSOALUNO=?"+
                                                   "IDCURSOALUNO=?"+
                                                   " WHERE IDALUNO=?";
      
       
      try{
         PreparedStatement stmt = this.conexao.prepareStatement(query);
         
         
         stmt.setString(1, aluno.getNome());
         stmt.setString(2, aluno.getCpf());
         stmt.setString(3, aluno.getEmail());
         stmt.setString(4, aluno.getTelefone());
         stmt.setDate(5,  aluno.getDataNascimento());
         stmt.setString(6, aluno.getStatusAluno());
         stmt.setDate(7, aluno.getInicioCursoAluno());
         stmt.setDate(8, aluno.getTerminoCursoAluno());
         stmt.setInt(9, aluno.getIdCurso());
         stmt.setInt(10,aluno.getId());
                     
         stmt.execute();
         
         //conexao.close();
         System.out.println("Aluno atualizado com sucesso");
      
      } catch (SQLException ex) {
                 System.out.println("atualizarAluno(): "+ex.toString());
      }
    }

    
    public Aluno procurarPorCpf (String cpfAluno) {
        Aluno alunoResultado = null;
        
        String query = "SELECT * FROM EASYTICKET.ALUNOS WHERE CPFALUNO=?";
        
        try {
                 
                 PreparedStatement stmt = this.conexao.prepareStatement(query);
                 stmt.setString(1, cpfAluno);
                 ResultSet res = stmt.executeQuery();
                 
                 if (res.next()) {
                     alunoResultado = new Aluno();
                     alunoResultado.setId(res.getInt(1));
                     alunoResultado.setNome(res.getString(2));
                     alunoResultado.setCpf(res.getString(3));
                     alunoResultado.setEmail(res.getString(4));
                     alunoResultado.setTelefone(res.getString(5));
                     alunoResultado.setDataNascimento(Formatacao.transformarDateEmDateSql(res.getDate(6)));
                     alunoResultado.setStatusAluno(res.getString(7));
                     alunoResultado.setInicioCursoAluno(Formatacao.transformarDateEmDateSql(res.getDate(8)));
                     alunoResultado.setTerminoCursoAluno(Formatacao.transformarDateEmDateSql(res.getDate(9)));
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
