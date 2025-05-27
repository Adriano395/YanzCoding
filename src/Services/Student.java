package Services;

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
import static javax.swing.JOptionPane.YES_NO_OPTION;
import SystemFrames.UpdateFrame;
import java.util.Date;

public class Student {
    
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
            sql = "SELECT * FROM `id_registry`";
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
            
            sql = "INSERT into `id_registry` (studid , lastname, firstname, midinitial, college, gender, birthdi, age) values (?,?,?,?,?,?,?,?)";
            ps = connection.prepareCall(sql);
            ps.setInt(1, user.getID());
            ps.setString(2, user.getFname());
            ps.setString(3, user.getMname());
            ps.setString(4, user.getLname());
            ps.setObject(5,user.getCollege());
            ps.setString(6,user.getGender());
            ps.setDate(7, (java.sql.Date) user.getDate());
            ps.setInt(8,user.getAge());
            int result = ps.executeUpdate();
            
            if (result > 0){
                 JOptionPane.showMessageDialog(null , "A Human successfully added");
            } else{
                JOptionPane.showMessageDialog(null, "Failed to add Student");
            }
        } catch (Exception e) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void Delete (int ID){
        try {
            sql = "DELETE FROM `id_registry` WHERE studid=?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, ID);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Human deleted");
        } catch (SQLException e) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Delete Failed");
        }
    }
    public void InputData (User user){
        
    try {
        sql = "SELECT * FROM `id_registry` WHERE id=?";
        ps = connection.prepareStatement(sql);
        ps.setInt(1, user.getID());    
        ResultSet rs = ps.executeQuery();       
        if (rs.next()) {  
            String fname = rs.getString("fname");
            String mname = rs.getString("mname");
            String lname = rs.getString("lname");
            Object college = rs.getObject("college");
            
            
            UpdateFrame userForm = new UpdateFrame();
            userForm.setFname(fname);
            userForm.setMname(mname);
            userForm.setLname(lname);
            userForm.setCollege(college);
            
        } else {
            JOptionPane.showMessageDialog(null, "No data found");
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    }
    public void Update (User user){
        try{           
            // kulang
            sql = "UPDATE `id_registry` SET lastname=? firstname=? midinitial=? college=? gender=? birthdi=? age=? WHERE id=?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1,user.getID());
            ps.setString(2,user.getFname());
            ps.setString(3,user.getMname());
            ps.setString(4,user.getLname());
            ps.setObject(5,user.getCollege());
            ps.setObject(6,user.getGender());
            ps.setDate(7, (java.sql.Date) user.getDate());
            ps.setInt(8,user.getAge());
            int result = ps.executeUpdate();
            
            if (result > 0){
                int confirm = JOptionPane.showConfirmDialog(null , "Confirm Update","Confirmation",YES_NO_OPTION);
                if (JOptionPane.YES_OPTION == confirm){
                    JOptionPane.showMessageDialog(null, "Update Successful");
                }else{
                    
                }
            } else{
                JOptionPane.showMessageDialog(null, "Failed to Logged in");
            }
        }catch (Exception e){
            System.out.println(e);
         
        }
        
    }
     
}
