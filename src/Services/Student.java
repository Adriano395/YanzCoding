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


public class Student {
    
    private Connection connection;
    private Connector con;
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;
    private ResultSetMetaData rm;
    
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
            sql = "INSERT into database (id ,name, ) values(?,?)";
            ps = connection.prepareCall(sql);
            ps.setInt(0, user.getID());
            ps.setString(1, user.getName());

            ps.setDate(4, user.getDate());
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
            sql = "INSERT into database (login, )values (?)";
            ps  = connection.prepareCall(sql);
            ps.setTime(2,user.getTime());
            
        }catch (Exception e){
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void logOutTime (User user){
        try{
            sql = "INSERT into database ( logout)values (?)";
            ps  = connection.prepareCall(sql);
            ps.setTime(3,user.getTime());
            
        }catch (Exception e){
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
}
