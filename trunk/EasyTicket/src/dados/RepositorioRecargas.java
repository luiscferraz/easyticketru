/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import interfaces.IRepositorioRecargas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.Cartao;
import negocio.Recarga;

/**
 *
 * @author Nanda
 */
public class RepositorioRecargas implements IRepositorioRecargas {

    private Connection conexao;
    
    public RepositorioRecargas(){
        try {
            this.conexao = GenericDAO.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioRecargas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void inserir(Recarga recarga){
        String query = "INSERT INTO EASYTICKET.RECARGAS"+
                                          " (VALORRECARGA,"+
                                            "NUMCARTAORECARGA,DATARECARGA)"+
                                            
                        "VALUES (?,?,?)" ;
        
       
            try {
                PreparedStatement stmt = this.conexao.prepareStatement(query);

                stmt.setFloat(1, recarga.getValor());
                stmt.setInt(2, recarga.getNumCartao());
                stmt.setDate(3, recarga.getDataRecarga());

                stmt.execute();

                //conexao.close();
                System.out.println("Recarga realizada com sucesso!");
            } catch (SQLException ex) {
                System.out.println("RealizarRecarga(): "+ex.toString());
            } 
        
    }
    
    @Override
    public boolean existe(int idRecarga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Recarga recarga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Recarga buscarPorId(int idRecarga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Recarga> buscarPorCartao(int idCartao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Recarga> buscarPorData(Date data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
