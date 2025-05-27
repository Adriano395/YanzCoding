package SystemFrames;

import JDBC.Connector;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class SDFinalSys {

    public static void DataConnect(){
       Connector ct = new Connector();
        try {
            Connection jonel = ct.getConnection();
            if (jonel != null){
                JOptionPane.showMessageDialog(null, "Server Connection Established");
                MenuFrame addStudent = new MenuFrame();
                addStudent.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Failed Connection");              
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void main(String[] args) {
        DataConnect();
    }
    
}
