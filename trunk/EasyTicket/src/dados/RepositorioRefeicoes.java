/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import interfaces.IRepositorioRefeicoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.Refeicao;

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

    @Override
    public void inserir(Refeicao refeicao) {
        String query = "INSERT INTO EASYTICKET.REFEICOES"+
                                          " (DESCRICAOREFEICAO,VALORREFEICAO)"+
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

    @Override
    public boolean existe(int idRefeicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Refeicao refeicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Refeicao procurarPorId(int idRefeicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
