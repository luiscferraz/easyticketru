/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import interfaces.IRepositorioRefeicoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.Refeicao;
import util.Formatacao;

/**
 *
 * @author Nanda
 */
public class RepositorioRefeicoes implements IRepositorioRefeicoes {
    
    private Connection conexao;
    
    public RepositorioRefeicoes(){
        try {
            this.conexao = GenericDAO.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioRefeicoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public void inserir(Refeicao refeicao) {
        String query = "INSERT INTO EASYTICKET.REFEICOES"+
                                          " (DESCRICAO,VALOR)"+
                        "VALUES (?,?)" ;
        
       
            try {
                PreparedStatement stmt = this.conexao.prepareStatement(query);

                stmt.setString(1, refeicao.getDescricao());
                stmt.setString(2, refeicao.getValor());

                stmt.execute();

                //conexao.close();
                System.out.println("Refeição inserida com sucesso.");
            } catch (SQLException ex) {
                System.out.println("incluirRefeição(): "+ex.toString());
            } 
    }

    public boolean existe(String descricaoRefeicao) {
        if (this.procurarPorDescricao(descricaoRefeicao)!=null){
          return true;
        }else{
          return false;
        }
    }

    public void atualizar(Refeicao refeicao) {
        String query = "UPDATE EASYTICKET.ALUNOS SET DESCRICAO=?,"+
                                                   "VALOR=?"+
                                                   " WHERE IDREFEICAO=?";
      
       
      try{
         PreparedStatement stmt = this.conexao.prepareStatement(query);
         
         
         stmt.setString(1, refeicao.getDescricao());
         stmt.setString(2, refeicao.getValor());
                     
         stmt.execute();
         
         //conexao.close();
         System.out.println("Refeição atualizada com sucesso");
      
      } catch (SQLException ex) {
                 System.out.println("atualizarRefeição(): "+ex.toString());
      }
    }

    
    public Refeicao procurarPorDescricao(String descricao) {
        Refeicao refeicaoResultado = null;
        
        String query = "SELECT * FROM EASYTICKET.REFEICOES WHERE DESCRICAO=?";
        
        try {
                 
                 PreparedStatement stmt = this.conexao.prepareStatement(query);
                 stmt.setString(1, descricao);
                 ResultSet res = stmt.executeQuery();
                 
                 if (res.next()) {
                     refeicaoResultado = new Refeicao();
                     refeicaoResultado.setIdRefeicao(res.getInt(1));
                     refeicaoResultado.setDescricao(res.getString(2));
                     refeicaoResultado.setValor(res.getFloat(3));
                 }
                 //conexao.close();                
                                  
         } catch (SQLException ex) {
                 System.out.println("procurarRefeicaoPorDescricao: "+ex.toString());
         }
        
         return refeicaoResultado;
    }
    
    
    
}
