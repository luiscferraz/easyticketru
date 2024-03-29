/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import interfaces.IRepositorioCartoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.Aluno;
import negocio.Cartao;
import util.Formatacao;

/**
 *
 * @author Nanda
 */
public class RepositorioCartoes implements IRepositorioCartoes {

    private Connection conexao;
    
    public RepositorioCartoes(){
        try {
            this.conexao = GenericDAO.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inserir(Cartao cartao){
        String query = "INSERT INTO EASYTICKET.CARTOES"+
                                          " (STATUSCARTAO,"+
                                            "SALDOCARTAO,"+
                                            "CPFALUNOCARTAO)"+
                        "VALUES (?,?,?)" ;
        
       
            try {
                PreparedStatement stmt = this.conexao.prepareStatement(query);

                
                stmt.setString(1, cartao.getStatus());
                stmt.setFloat(2, cartao.getSaldo());                
                stmt.setString(3, cartao.getCpfAlunoCartao());

                stmt.execute();

                //conexao.close();
                System.out.println("Cartão inserido com sucesso.");
            } catch (SQLException ex) {
                System.out.println("incluirCartao(): "+ex.toString());
            } 

    }
    
    
   
    public boolean existe(int numCartao) {
        if (this.procurarPorNumero(numCartao)!=null){
          return true;
        }else{
          return false;
        }
    }

    public void atualizar(Cartao cartao) {
      String query = "UPDATE EASYTICKET.CARTOES SET STATUSCARTAO=? WHERE NUMCARTAO=?";
      
       
      try{
         PreparedStatement stmt = this.conexao.prepareStatement(query);
         
         
         
         stmt.setString(1, cartao.getStatus());
         stmt.setInt(2, cartao.getNumCartao());
                     
         stmt.execute();
         
         //conexao.close();
         System.out.println("Cartão atualizado com sucesso");
      
      } catch (SQLException ex) {
                 System.out.println("atualizarCartao(): "+ex.toString());
      }
    }

    @Override
    public Cartao procurarPorNumero(int numCartao) {
       Cartao cartaoResultado = null;
        
        String query = "SELECT * FROM EASYTICKET.CARTOES WHERE NUMCARTAO=?";
        
        try {
                 
                 PreparedStatement stmt = this.conexao.prepareStatement(query);
                 stmt.setInt(1, numCartao);
                 ResultSet res = stmt.executeQuery();
                 
                 if (res.next()) {
                     cartaoResultado = new Cartao();
                     cartaoResultado.setNumCartao(res.getInt(1));
                     cartaoResultado.setStatus(res.getString(2));
                     cartaoResultado.setSaldo(res.getFloat(3));
                     cartaoResultado.setCpfAlunoCartao(res.getString(4));
                                     
                 }
                 //conexao.close();                
                                  
         } catch (SQLException ex) {
                 System.out.println("procurarCartaoPorNumero: "+ex.toString());
         }
        
         return cartaoResultado;
    }

   
    public Cartao procurarPorCpf(String cpf) {
        Cartao cartaoResultado = null;
        
        String query = "SELECT * FROM EASYTICKET.CARTOES WHERE CPFALUNOCARTAO=?";
        
        try {
                 
                 PreparedStatement stmt = this.conexao.prepareStatement(query);
                 stmt.setString(1, cpf);
                 ResultSet res = stmt.executeQuery();
                 
                 if (res.next()) {
                     cartaoResultado = new Cartao();
                     cartaoResultado.setNumCartao(res.getInt(1));
                     cartaoResultado.setStatus(res.getString(2));
                     cartaoResultado.setSaldo(res.getFloat(3));
                     cartaoResultado.setCpfAlunoCartao(res.getString(4));
                                     
                 }
                 //conexao.close();                
                                  
         } catch (SQLException ex) {
                 System.out.println("procurarCartaoPorNumero: "+ex.toString());
         }
        
         return cartaoResultado;
        
    }
    //métodos apenas com assinatura, ainda falta definir a interação com o banco de dados.
    
    public Cartao procurarPorIdAluno(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public boolean existeCartaoAluno(int idAluno) {
      if (this.procurarPorIdAluno(idAluno)!=null){
          return true;
      }else{
          return false;
      }
    }

    public List<Cartao> listarCartoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void efetuarRecargaCartao(Cartao cartao) {
        String query = "UPDATE EASYTICKET.CARTOES SET SALDOCARTAO=? WHERE NUMCARTAO=?";
      
       
      try{
         PreparedStatement stmt = this.conexao.prepareStatement(query);
         
         
         
         stmt.setFloat(1, cartao.getSaldo());
         stmt.setInt(2, cartao.getNumCartao());
                     
         stmt.execute();
         
         //conexao.close();
         System.out.println("Cartão atualizado com sucesso");
      
      } catch (SQLException ex) {
                 System.out.println("atualizarCartao(): "+ex.toString());
      }
    }
    
}
