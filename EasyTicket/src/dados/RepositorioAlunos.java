/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import interfaces.IRepositorioAlunos;
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
public class RepositorioAlunos extends GenericDAO implements IRepositorioAlunos {
    
    public RepositorioAlunos(){
    }
    
    
    
    public void inserir(Aluno aluno){
        
        String query = "INSERT INTO ETICKET (ALUNOS)(CPF, NOME, TELEFONE,DATANASC,EMAIL,INICIOCURSO ,TERMINOCURSO,STATUSALUNO,CURSO) VALUES (?,?,?,?,?,?,?,?,?)" ;
        try {
            executeCommand(query, aluno.getCpf(),
                                  aluno.getNome(),
                                  aluno.getTelefone(),
                                  aluno.getDataNascimento(),
                                  aluno.getEmail(),
                                  aluno.getInicioCursoAluno(),
                                  aluno.getTerminoCursoAluno(),                              
                                  EnumStatusAluno.ATIVO,
                                  aluno.getCurso());
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioAlunos.class.getName()).log(Level.SEVERE, null, ex);
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
