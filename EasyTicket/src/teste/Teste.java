/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dados.RepositorioCursos;
import dados.RepositorioFuncionarios;
import gui.TelaAlunos;
import gui.TelaCargos;
import gui.TelaCursos;
import gui.TelaFuncionarios;
import gui.TelaPrincipalFuncionario;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import negocio.CadastroFuncionarios;
import negocio.Curso;
import negocio.Fachada;
import negocio.Funcionario;
import util.Formatacao;
import util.Validacao;

/**
 *
 * @author Nanda
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        TelaPrincipalFuncionario telaPrincipalFuncionario = new TelaPrincipalFuncionario();
        telaPrincipalFuncionario.setVisible(true);
        
        //String nome = "Fernanda";
        
        //String dataNasc = "08/03/1982";
        //Date dataNascDate = Formatacao.transformarStringEmDate(dataNasc);
        //java.sql.Date dataNascSqlDate = Formatacao.transformarDateEmDateSql(dataNascDate);
        
        //int idCargo = 1;
        //String email = "nandacms@gmail.com";
        //String cpf = "806.384575-72";
        //String status = "ATIVO";
        //String fone = "(81)9807-7534";
        
        //Funcionario f = new Funcionario(nome, email, cpf, fone, dataNascSqlDate, idCargo, status);
        
        //RepositorioFuncionarios repositorio = new RepositorioFuncionarios();
        //repositorio.inserir(f);
        
        //System.out.println(repositorio.existe(cpf));
        
        //CadastroFuncionarios cadastro = new CadastroFuncionarios(repositorio);
        //System.out.println(cadastro.existe(cpf));
        
        //Fachada fachada = Fachada.obterInstancia();
        //fachada.cadastrarFuncionario(f);
        //System.out.println(fachada.verificarExistenciaFuncionarioPorCpf(cpf));
         
        
    }
}

        