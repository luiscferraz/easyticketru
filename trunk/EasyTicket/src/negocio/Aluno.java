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
    
    private Curso curso;
    private EnumStatusAluno statusAluno;
    private Date inicioCursoAluno;
    private Date terminoCursoAluno;
    
//    public Aluno(String nome, String email, int cpf, int telefone, Date dataNascimento, Curso curso, EnumStatusAluno statusAluno,
//                 Date inicioCursoAluno, Date terminoCursoAluno){
//        
//        super(nome, email, cpf, telefone, dataNascimento);
//        this.curso = curso;
//        this.statusAluno = statusAluno;
//        this.inicioCursoAluno = inicioCursoAluno;
//        this.terminoCursoAluno = terminoCursoAluno;
//        
//    }
    
    public Aluno(){}

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getInicioCursoAluno() {
        return inicioCursoAluno;
    }

    public void setInicioCursoAluno(Date inicioCursoAluno) {
        this.inicioCursoAluno = inicioCursoAluno;
    }

    public EnumStatusAluno getStatusAluno() {
        return statusAluno;
    }

    public void setStatusAluno(EnumStatusAluno statusAluno) {
        this.statusAluno = statusAluno;
    }

    public Date getTerminoCursoAluno() {
        return terminoCursoAluno;
    }

    public void setTerminoCursoAluno(Date terminoCursoAluno) {
        this.terminoCursoAluno = terminoCursoAluno;
    }
    
    public Boolean isAtivo(Aluno aluno){
        if (this.statusAluno == EnumStatusAluno.ATIVO){
            return true;
        }else{
            return false;
        }
       
    }
    
    
    
}
