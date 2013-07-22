/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Date;

/**
 *
 * @author Nanda
 */
public class Aluno extends Pessoa {
    
    private Curso curso;
    private EnumStatusAluno statusAluno;
    private String inicioCursoAluno;
    private String terminoCursoAluno;
    
    public Aluno(String nome, String email, int cpf, int telefone, Date dataNascimento, Curso curso, EnumStatusAluno statusAluno,
                 String inicioCursoAluno, String terminoCursoAluno){
        
        super(nome, email, cpf, telefone, dataNascimento);
        this.curso = curso;
        this.statusAluno = statusAluno;
        this.inicioCursoAluno = inicioCursoAluno;
        this.terminoCursoAluno = terminoCursoAluno;
        
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getInicioCursoAluno() {
        return inicioCursoAluno;
    }

    public void setInicioCursoAluno(String inicioCursoAluno) {
        this.inicioCursoAluno = inicioCursoAluno;
    }

    public EnumStatusAluno getStatusAluno() {
        return statusAluno;
    }

    public void setStatusAluno(EnumStatusAluno statusAluno) {
        this.statusAluno = statusAluno;
    }

    public String getTerminoCursoAluno() {
        return terminoCursoAluno;
    }

    public void setTerminoCursoAluno(String terminoCursoAluno) {
        this.terminoCursoAluno = terminoCursoAluno;
    }
    
    
    
}
