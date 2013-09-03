/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import interfaces.IRepositorioCargos;
import java.util.List;
import negocio.Cargo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Nanda
 */
public class RepositorioCargos implements IRepositorioCargos {

    private Connection conexao;
    
    public RepositorioCargos(){
        try {
            this.conexao = GenericDAO.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(RepositorioCargos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public void inserir(Cargo cargo) {
        String query = "INSERT INTO EASYTICKET.CARGOS (NOMECARGO) VALUES (?)" ;  
       
            try {
                PreparedStatement stmt = this.conexao.prepareStatement(query);

                stmt.setString(1, cargo.getNome());

                stmt.execute();
                //conexao.close();
                System.out.println("Cargo inserido com sucesso.");
            } catch (SQLException ex) {
                System.out.println("incluirCargo(): "+ex.toString());
            } 
        
    }

    public boolean existe(int idCargo) {
      if (this.procurarPorId(idCargo)!=null){
          return true;
      }else{
          return false;
      }
        
    }

  
    public void atualizar(Cargo cargo) {
       String query = "UPDATE EASYTICKET.CARGOS SET NOMECARGO=? WHERE IDCARGO=?";
       
      try{
         PreparedStatement stmt = this.conexao.prepareStatement(query);
         
         stmt.setString(1,cargo.getNome());
         stmt.setInt(2, cargo.getIdCargo());
         stmt.execute();
         
         //conexao.close();
         System.out.println("Cargo atualizado com sucesso");
      
      } catch (SQLException ex) {
                 System.out.println("atualizarCargo(): "+ex.toString());
      }
    }


    
    public Cargo procurarPorId(int idCargo) {
        Cargo cargoResultado = null;
        
        String query = "SELECT * FROM EASYTICKET.CARGOS WHERE IDCARGO= "+idCargo;
        
        try {
                 
                 PreparedStatement stmt = this.conexao.prepareStatement(query);
                 ResultSet res = stmt.executeQuery();
                 
                 if (res.next()) {
                     cargoResultado = new Cargo();
                     cargoResultado.setIdCargo(res.getInt(1));
                     cargoResultado.setNome(res.getString(2));
                     //System.out.println(res.getInt(1));
                    // System.out.println(res.getString(2)); 
                 }
                 //conexao.close();                
                                  
         } catch (SQLException ex) {
                 System.out.println("procurarCargoPorId(): "+ex.toString());
         }
        
         return cargoResultado;
    }

    
    public int findIdByNome(String nomeCargo) {
        int idCargo=-1;
        
        String query = "SELECT IDCARGO FROM EASYTICKET.CARGOS WHERE NOMECARGO=?";
        
        try {                 
             PreparedStatement stmt = this.conexao.prepareStatement(query);
             stmt.setString(1, nomeCargo);
             ResultSet res = stmt.executeQuery();

             if (res.next()) {
                 idCargo = res.getInt(1);
                 //System.out.println(res.getInt(1));
                // System.out.println(res.getString(2)); 
             }
             //conexao.close();                
                                  
         } catch (SQLException ex) {
                 System.out.println("procurarCargoPorId(): "+ex.toString());
         }
        
         return idCargo;

    
    }
    
    public void deletar(int idCargo) {
        String query = "DELETE FROM EASYTICKET.CARGOS WHERE IDCARGO= "+idCargo;
        
        try {
                 PreparedStatement stmt = this.conexao.prepareStatement(query);
                
                 if(this.existe(idCargo)){
                     stmt.execute();
                     System.err.println("Cargo deletado com sucesso.");
                 }else{
                     System.out.println("Cargo inexistente.");
                 }
                 //conexao.close();
                                  
         } catch (SQLException ex) {
                 System.out.println("deletarCargo(): "+ex.toString());
         }
    }

    
    public List<Cargo> listarCargos() {
        List<Cargo> listaCargos = new ArrayList<Cargo>();
          
          String query = "SELECT * FROM EASYTICKET.CARGOS ORDER BY NOMECARGO";
          
          try {
                               
              PreparedStatement stmt = this.conexao.prepareStatement(query);
              ResultSet rs = stmt.executeQuery();
                 
              while(rs.next()){
                  Cargo cargo = new Cargo();
                  cargo.setIdCargo(rs.getInt(1));
                  cargo.setNome(rs.getString(2));
                
                  listaCargos.add(cargo);
              }
              //conexao.close(); 
                       
          }catch (SQLException ex) {
             
                  System.out.println("listarCargos(): "+ex.toString());
          
          }
          return listaCargos;
    }
    
}
