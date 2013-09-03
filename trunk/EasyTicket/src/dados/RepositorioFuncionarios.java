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
import util.Formatacao;

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
                stmt.setInt(6, funcionario.getIdCargo());
                stmt.setString(7, funcionario.getStatusFuncionario());

                stmt.execute();

                //conexao.close();
                System.out.println("Funcionario inserido com sucesso!");
            } catch (SQLException ex) {
                System.out.println("incluirFuncionario(): "+ex.toString());
            } 
        
    }

    public boolean existe(String cpfFuncionario) {
         if (this.procurarPorCpf(cpfFuncionario)!=null){
          return true;
        }
        else{
          return false;
        }
    }

  
    public void atualizar(Funcionario funcionario) {
         String query = "UPDATE EASYTICKET.FUNCIONARIOS SET NOMEFUNCIONARIO=?,"+
                                                   "CPFFUNCIONARIO=?,"+
                                                   "EMAILFUNCIONARIO=?,"+
                                                   "TELEFONEFUNCIONARIO=?,"+
                                                   "DATANASCIMENTOFUNCIONARIO=?,"+
                                                   "STATUSFUNCIONARIO=?,"+
                                                   " WHERE IDFUNCIONARIO=?";
       
      try{
         PreparedStatement stmt = this.conexao.prepareStatement(query);
         
         
         stmt.setString(1, funcionario.getNome());
         stmt.setString(2, funcionario.getCpf());
         stmt.setString(3, funcionario.getEmail());
         stmt.setString(4, funcionario.getTelefone());
         stmt.setDate(5, (Date) funcionario.getDataNascimento());
         stmt.setString(6, funcionario.getStatusFuncionario());
         stmt.setInt(7,funcionario.getId());
                     
         stmt.execute();
         
         //conexao.close();
         System.out.println("Funcionário atualizado com sucesso");
      
      } catch (SQLException ex) {
                 System.out.println("atualizarFuncionario(): "+ex.toString());
      }
    }

    public Funcionario procurarPorCpf(String cpfFuncionario) {
        Funcionario funcionarioResultado = null;
        
        String query = "SELECT * FROM EASYTICKET.FUNCIONARIOS WHERE CPFFUNCIONARIO=?";
        
        try {
                 
                 PreparedStatement stmt = this.conexao.prepareStatement(query);
                 stmt.setString(1, cpfFuncionario);
                 ResultSet res = stmt.executeQuery();
                 
                 if (res.next()) {
                     funcionarioResultado = new Funcionario();
                     funcionarioResultado.setId(res.getInt(1));
                     funcionarioResultado.setNome(res.getString(2));
                     funcionarioResultado.setCpf(res.getString(3));
                     funcionarioResultado.setEmail(res.getString(4));
                     funcionarioResultado.setTelefone(res.getString(5));
                     funcionarioResultado.setDataNascimento(Formatacao.transformarDateEmDateSql(res.getDate(6)));
                     funcionarioResultado.setStatusFuncionario(res.getString(7));
                     funcionarioResultado.setIdCargo(res.getInt(8));
                                     
                 }
                 //conexao.close();                
                                  
         } catch (SQLException ex) {
                 System.out.println("procurarFuncionarioPorCpf: "+ex.toString());
         }
        
         return funcionarioResultado;
    }


    @Override
    public ArrayList<Funcionario> buscarPorCargo(int idCargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deletar(String cpfFuncionario) {
        
        String query = "DELETE FROM EASYTICKET.FUNCIONARIO WHERE CPFFUNCIONARIO= "+cpfFuncionario;
        
        try {
                 PreparedStatement stmt = this.conexao.prepareStatement(query);
                
                 if(this.existe(cpfFuncionario)){
                     stmt.execute();
                     System.err.println("Funcionário deletado com sucesso.");
                 }else{
                     System.out.println("Funcionário inexistente.");
                 }
                 //conexao.close();
                                  
         } catch (SQLException ex) {
                 System.out.println("deletarFuncionario(): "+ex.toString());
         }
    }

    
}
    

