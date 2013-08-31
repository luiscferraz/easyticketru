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
public class Pessoa {
    private int id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private Date dataNascimento;
    
    public Pessoa(){}
    
//    public Pessoa(String nome, String email, String cpf, String telefone, Date dataNascimento){
//        this.nome = nome;
//        this.email = email;
//        this.cpf = cpf;
//        this.telefone = telefone;
//        this.dataNascimento = dataNascimento;
//    }
    
//    public Pessoa(int id, String nome, String email, String cpf, String telefone, Date dataNascimento ){
//        this.id = id;
//        this.nome = nome;
//        this.email = email;
//        this.cpf = cpf;
//        this.telefone = telefone;
//        this.dataNascimento = dataNascimento;
//    }

    
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
}