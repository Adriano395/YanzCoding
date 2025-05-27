  
package JDBC;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connector {
//    private static String URL = "jdbc:mysql://localhost:3306/student_db";
//    private static String User = "root";
//    private static String Password = "database123";
    public Connection getConnection(){
        
//            Connection con = null;
//                try {
//                    Class.forName("com.mysql.cj.jdbc.Driver");
//                    con = DriverManager.getConnection(URL, User, Password);
//                    JOptionPane.showMessageDialog(null, "Sumakses ang koneksyon mo");
//                }catch (ClassNotFoundException classNotFoundException) {
//                    JOptionPane.showMessageDialog(null, classNotFoundException.getMessage());
//                }catch (SQLException se) {
//                    JOptionPane.showMessageDialog(null, se.getMessage());
//                }  return con;
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
