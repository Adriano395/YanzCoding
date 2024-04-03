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
import java.sql.Time;

public class Student {
    
    private Connection connection;
    private Connector con;
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;
    private ResultSetMetaData rm;
    private Time time;
    public Student(){
        this.con = new Connector();
        this.connection = new Connector().getConnection();
    }
    public void populateTable (DefaultTableModel model){
        try{
            model.setRowCount(0);
            sql = "SELECT * FROM Database";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            rm =rs.getMetaData();
            int columnCount = rm.getColumnCount();
            while (rs.next()){
                Object[] row = new Object[columnCount];
                for (int i = 1;i < columnCount; i++){
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
            sql = "INSERT into database (id ,fname,mname,lname ) values(?,?,?,?)";
            ps = connection.prepareCall(sql);
            ps.setInt(0, user.getID());
            ps.setString(1, user.getFname());
            ps.setString(2, user.getMname());
            ps.setString(3, user.getLname());
            
            
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
            java.sql.Time sqlTime = new java.sql.Time(time.getTime());
            sql = "INSERT into database (login, )values (?)";
            ps  = connection.prepareCall(sql);
            ps.setTime(4,sqlTime);
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
            java.sql.Time sqlTime = new java.sql.Time(time.getTime());
            sql = "INSERT into database ( logout)values (?)";
            ps  = connection.prepareCall(sql);
            ps.setTime(5,sqlTime);
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
   
    
}
