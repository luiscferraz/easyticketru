/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Date;

/**
 *
 * @author Marcela
 */
public class Aluno extends Pessoa {
    
    private int idCurso;
    private String statusAluno;
    private Date inicioCursoAluno;
    private Date terminoCursoAluno;
    
    public Aluno(String nome, String email, String cpf, String telefone,
            Date dataNascimento, int idCurso, String statusAluno,
                 Date inicioCursoAluno, Date terminoCursoAluno){
        
        super(nome, email, cpf, telefone, dataNascimento);
        this.statusAluno = statusAluno;
        this.inicioCursoAluno = inicioCursoAluno;
        this.terminoCursoAluno = terminoCursoAluno;
        
    }
    
    public Aluno(int id,String nome, String email, String cpf, String telefone,
            Date dataNascimento, int idCurso, String statusAluno,
                 Date inicioCursoAluno, Date terminoCursoAluno){
        super(id,nome, email, cpf,telefone,dataNascimento);
        this.idCurso = idCurso;
        this.statusAluno = statusAluno;
        this.inicioCursoAluno = inicioCursoAluno;
        this.terminoCursoAluno = terminoCursoAluno;
        
    }
    
    public Aluno(){}

    public int getIdCurso() {
        return this.idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public Date getInicioCursoAluno() {
        return inicioCursoAluno;
    }

    public void setInicioCursoAluno(Date inicioCursoAluno) {
        this.inicioCursoAluno = inicioCursoAluno;
    }

    public String getStatusAluno() {
        return statusAluno;
    }

    public void setStatusAluno(String statusAluno) {
        this.statusAluno = statusAluno;
    }

    public Date getTerminoCursoAluno() {
        return terminoCursoAluno;
    }

    public void setTerminoCursoAluno(Date terminoCursoAluno) {
        this.terminoCursoAluno = terminoCursoAluno;
    }
    
    public Boolean isAtivo(Aluno aluno){
        if (this.statusAluno.equals(EnumStatusAluno.ATIVO)){
            return true;
        }else{
            return false;
        }
       
    }
    
    
    
}
