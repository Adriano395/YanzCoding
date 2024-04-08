package Main;

import JDBC.Connector;
import Controller.AttendanceMonitor;
import java.sql.Connection;


public class main {

    public static void JDBCConnect(){
       Connector ct = new Connector();
        try {
            Connection jonel = ct.getConnection();
            if (jonel != null){
                System.out.println("Succesfully Connected to DataBase ");
            }
            else{
                System.out.println("Failed to Connect");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        JDBCConnect();
        AttendanceMonitor addStudent = new AttendanceMonitor();
        addStudent.setVisible(true);
    }
}

