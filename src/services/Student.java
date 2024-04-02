
package services;

import JDBC.JDBCConnector;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.UserDAO;

public class Student {
    private Connection connection;
    private JDBCConnector jdbccon;
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;
    private ResultSetMetaData rm;
    public Student(){
        this.jdbccon = new JDBCConnector();
        this.connection = new JDBCConnector().getConnection();
        
    }
    public void addStudent(UserDAO userdao){
        try {
            sql = "INSERT into data_base (fname, mname, lname, age,  gender, civilstatus , address) values(?,?,?,?,?,?,?)";
            ps = connection.prepareCall(sql);
            ps.setString(1, userdao.getFname());
            ps.setString(2, userdao.getMname());
            ps.setString(3, userdao.getLname());
            ps.setInt(4, userdao.getAge());
            ps.setString(5, userdao.getGender());
            ps.setString(6, userdao.getCivilstatus());
            ps.setString(7, userdao.getAddress());
            
            int result = ps.executeUpdate();
            if (result > 0){
                 JOptionPane.showMessageDialog(null , "Student successfully added");
            } else{
                JOptionPane.showMessageDialog(null, "Failed to add Student");
            }
        } catch (Exception e) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void PopulateTable (DefaultTableModel model){
        try{
           model.setRowCount(0);
           sql = "SELECT * FROM data_base";
           ps = connection.prepareStatement(sql);
           rs = ps.executeQuery();
           rm = rs.getMetaData();
           int columnCount = rm.getColumnCount();
           while (rs.next()){
               Object[] row = new Object[columnCount];
               for (int i = 1; i < columnCount;i++){
                       row[i - 1] = rs.getObject(i);
                       
                }
                model.addRow(row);
           }
        
    }catch (Exception e){
    
    }
    }
}
    
