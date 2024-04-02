package main;

import JDBC.JDBCConnector;
import controller.addstudent;
import java.sql.Connection;


public class main {

    public static void JDBCConnect(){
       JDBCConnector ct = new JDBCConnector();
        try {
            Connection Local = ct.getConnection();
            if (Local != null){
                System.out.println("Connected");
            }
            else{
                System.out.println("Failed Connection");
            }
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        JDBCConnect();
        addstudent addStudent = new addstudent();
        addStudent.setVisible(true);
    }
}
