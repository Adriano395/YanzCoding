package JonelCorp;
import java.util.Scanner;

public class Employee extends HR {
    public void display(){
        System.out.println("Hello ");
        
    }
        
    public void addEmployee(){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Hello I want to employ");
        System.out.println("Fname: ");
        Fname = scn.nextLine();
        System.out.println("Mname: ");
        Mname = scn.nextLine();
    }
}
