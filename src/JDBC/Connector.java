  
package JDBC;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connector {

    public Connection getConnection(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/iscp_id","root","database123");
        } catch (ClassNotFoundException |SQLException e) {
            e.printStackTrace();
            //Logger.getLogger(JDBCConnector.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
        
    }
    public void closeConnection(Connection connection){
        try {
            if (connection != null && !connection.isClosed()) {
               connection.close();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            
            //Logger.getLogger(JDBCConnector.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
