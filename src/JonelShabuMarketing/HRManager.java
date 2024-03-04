package JonelShabuMarketing;
import java.util.Scanner;

public class HRManager extends Employee{
    Scanner scn = new Scanner(System.in);
   
    String position;
    String name2;
    String position2;
    public void work(){
        System.out.println("Hello Drug Adick");
        System.out.println("Enter Name: ");
        name = scn.nextLine();
        System.out.println("Position: ");
        position = scn.nextLine();
        
    }
    public void Data(){
        System.out.println("Name: "+ name);
        System.out.println("Position: "+ position);
    }
    public void addEmployee(){
        dailySalary = 570;
        System.out.println("Wanted");
        System.out.println("Enter Name: ");
        name2 = scn.nextLine();
        System.out.println("Enter Posistion: ");
        position2 = scn.nextLine();
        System.out.println("Daily Salary is " + dailySalary);
    }
}
