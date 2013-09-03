/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import interfaces.IRepositorioFuncionarios;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.Funcionario;
import negocio.EnumStatusFuncionario;

/**
 *
 * @author Nanda
 */
public class RepositorioFuncionarios implements IRepositorioFuncionarios{
    
    private Connection conexao;
    
    public RepositorioFuncionarios(){
        try {
            this.conexao = GenericDAO.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void inserir(Funcionario funcionario){
        String query = "INSERT INTO EASYTICKET.FUNCIONARIOS"+
                                          " (NOMEFUNCIONARIO,"+
                                            "CPFFUNCIONARIO,"+
                                            "EMAILFUNCIONARIO,"+
                                            "TELEFONEFUNCIONARIO,"+
                                            "DATANASCIMENTOFUNCIONARIO,"+
                                            "IDCARGOFUNCIONARIO,"+
                                            "STATUSFUNCIONARIO)"+
                        "VALUES (?) (?) (?) (?) (?) (?) (?)" ;
        
       
            try {
                PreparedStatement stmt = this.conexao.prepareStatement(query);

                stmt.setString(1, funcionario.getNome());
                stmt.setString(2, funcionario.getCpf());
                stmt.setString(3, funcionario.getEmail());
                stmt.setString(4, funcionario.getTelefone());
                stmt.setDate(5, (Date) funcionario.getDataNascimento());
                stmt.setString(6, funcionario.getCargo());
                stmt.setString(7, funcionario.getStatusFuncionario());

                stmt.execute();

                //conexao.close();
                System.out.println("Funcionario inserido com sucesso.");
            } catch (SQLException ex) {
                System.out.println("incluirFuncionario(): "+ex.toString());
            } 
        
    }

    }

    @Override
    public boolean existe(int cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Funcionario procurarPorCpf(int cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Funcionario> buscarPorCargo(String cargoFuncionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
