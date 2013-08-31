/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nanda
 */
public class GenericDAO {
    public static Connection getConnection() throws Exception {
                
        String driver = "com.mysql.jdbc.Driver";  
        String user   = "root";  
        String senha = "root";  
        String url      = "jdbc:mysql://localhost:3306/easyticket";  

        Class.forName(driver);  
        Connection con = null;  
  
        con = (Connection) DriverManager.getConnection(url, user, senha); 
        System.out.println("Conexão realizada com sucesso."); 
        return con;      
        
    }
    
    public static void close(Statement statement, Connection dbConnection){
        try {
            /**if (statement != null) {
              statement.close();
            }
            **/
            if (dbConnection != null) {
              dbConnection.close();
            }
        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
    
    }
    
    public Statement getStatement() throws SQLException, Exception {
        return getConnection().createStatement();
    }

    public PreparedStatement getStatement(String st) throws SQLException, Exception {
        return getConnection().prepareStatement(st);
    }

    public ResultSet executeQuery(String query,Object... params) throws SQLException, Exception {
        PreparedStatement ps = getStatement(query);
        for (int i = 0; i < params.length; i++) {
            ps.setObject(i+1, params[i]);
        }
        return ps.executeQuery();
    }

    public int executeCommand(String query,Object... params) throws SQLException, Exception {
        int result;
        try (PreparedStatement ps = getStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                try {
                ps.setObject(i+1, params[i]);
                } catch (Exception e) {
                    System.out.println("Error to try "+i+" with value "+params[i]);
                }
            }
            result = ps.executeUpdate();
        }
        return result;
    }

    public Integer getNextId(String tableName) throws SQLException, Exception {
        ResultSet rs = executeQuery("select MAX(ID) from APP."+tableName);
        rs.next();
        Object result = rs.getObject(1);
        if (result == null) {
            rs.close();
            return 1;
        } else {
            return ((Integer)result)+1;
        }
    }

}
