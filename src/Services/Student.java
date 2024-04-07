package Services;
import Controller.AttendanceMonitor;
import JDBC.Connector;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import Model.User;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import java.sql.Time;
public class Student{
    
    Connection connection;
    Connector con;
    PreparedStatement ps;
    String sql;
    ResultSet rs;
    ResultSetMetaData rm;
   
    public Student(){
        con = new Connector();
        connection = new Connector().getConnection();
    }
    public void populateTable (DefaultTableModel model){
        try{
            model.setRowCount(0);
            sql = "SELECT * FROM `attendance`";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            rm = rs.getMetaData();
            int columnCount = rm.getColumnCount();
            while(rs.next()){
                Object[] row = new Object[columnCount];
                for(int i = 1; i <= columnCount; i++){
                    row [i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void addStudent(User user){
        try {
            
            sql = "INSERT into `attendance` (id ,fname,mname,lname,login,logout) values(?,?,?,?,?,?)";
            ps = connection.prepareCall(sql);
            ps.setInt(1, user.getID());
            ps.setString(2, user.getFname());
            ps.setString(3, user.getMname());
            ps.setString(4, user.getLname());
            
            ps.setString(5,"");
            ps.setString(6,"");
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
    public void logInTime (User user){
        try{
            
           
            sql = "ADD to `attendance` (login,logout)values(?,?) ";
            ps = connection.prepareStatement(sql);
            
            ps.setTime(5, new Time(System.currentTimeMillis()));
            ps.setString(6,"");
            int result = ps.executeUpdate();
            
            if (result > 0){
                 JOptionPane.showMessageDialog(null , "Student successfully Logged in");
            } else{
                JOptionPane.showMessageDialog(null, "Failed to Logged in");
            }
        }catch (Exception e){
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void logOutTime (User user){
        try{
            sql = "UPDATE `attendance` SET fname=?, mname=?, lname=?,  WHERE id=?";
            sql = "INSERT into `attendance` ( logout)values (?)";
            ps  = connection.prepareCall(sql);
            ps.setTime(6, new Time(System.currentTimeMillis()));
            int result = ps.executeUpdate();
            if (result > 0){
                 JOptionPane.showMessageDialog(null , "Student Logged out");
            } else{
                JOptionPane.showMessageDialog(null, "Failed to Logged out");
            }
        }catch (Exception e){
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void Delete (int ID){
        try {
            sql = "DELETE FROM `attendance` WHERE id=?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, ID);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Student deleted");
        } catch (SQLException e) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Delete Failed");
        }
    }
}
