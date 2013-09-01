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
    
    
    @Override
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
                System.out.println("incluirCurso(): "+ex.toString());
            } 
        
    }

    @Override
    public boolean existe(int cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aluno procurarPorCpf(int cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Aluno> buscarPorCurso(int idCurso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
