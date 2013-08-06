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
    public Connection getConnection() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection cx = DriverManager.getConnection("jdbc:derby://localhost:1527/eticket", "eticket", "eticket");
            return cx;
        } catch (Exception ex) {
            Logger.getLogger(GenericDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public Statement getStatement() throws SQLException {
        return getConnection().createStatement();
    }

    public PreparedStatement getStatement(String st) throws SQLException {
        return getConnection().prepareStatement(st);
    }

    public ResultSet executeQuery(String query,Object... params) throws SQLException {
        PreparedStatement ps = getStatement(query);
        for (int i = 0; i < params.length; i++) {
            ps.setObject(i+1, params[i]);
        }
        return ps.executeQuery();
    }

    public int executeCommand(String query,Object... params) throws SQLException {
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

    public Integer getNextId(String tableName) throws SQLException {
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
