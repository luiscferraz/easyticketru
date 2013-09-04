/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import interfaces.IRepositorioCartoes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import negocio.Cartao;

/**
 *
 * @author Nanda
 */
public class RepositorioCartoes implements IRepositorioCartoes {

    public void inserir(Cartao cartao){
        String query = "INSERT INTO EASYTICKET.CARTOES"+
                                          " (NUMCARTAO,STATUSCARTAO,"+
                                            "SALDOCARTAO,"+
                                            "IDALUNOCARTAO)"+
                        "VALUES (?,?,?,?)" ;
        
       
            try {
                PreparedStatement stmt = this.conexao.prepareStatement(query);

                stmt.setInt(1, cartao.getIdCartao());
                stmt.setFloat(2, cartao.getStatus());
                stmt.setString(3, cartao.getSaldo());                
                stmt.setInt(4, cartao.getCpfAluno());

                stmt.execute();

                //conexao.close();
                System.out.println("Cartão inserido com sucesso.");
            } catch (SQLException ex) {
                System.out.println("incluirCartao(): "+ex.toString());
            } 
        
    }

    @Override
    public boolean existe(int numeroCartao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Cartao cartao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cartao procurarPorNumero(int numeroCartao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cartao procurarPorCpf(int cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
