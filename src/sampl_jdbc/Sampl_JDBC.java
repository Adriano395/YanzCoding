package sampl_jdbc;

import JDBC.JDBCConnector;
import java.sql.Connection;


public class Sampl_JDBC {
    public static void Jihyo(){
        JDBCConnector jihyo = new JDBCConnector();
        try{
            Connection _zyozyo = jihyo.getConnection();
            if (_zyozyo != null){
                System.out.println("The Bluetooth device is connected successfully.");
            }
            else{
                System.out.println("Acces Denied");
            }
    }catch(Exception e){
    }
    
    
    
    
}
public static void main(String[]args){
    Jihyo();
}
}