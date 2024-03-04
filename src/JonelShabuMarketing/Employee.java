package JonelShabuMarketing;
import java.util.Scanner;


public class Employee  {
    String name;
    int dailySalary;
    int days;
    int salary;
    Scanner scn = new Scanner(System.in); 
    public void work(){
         
        System.out.println("Enter Days of Work: " );
        days = scn.nextInt();
}
    public void getSalary(){
        dailySalary = 570;
        salary = dailySalary * days;
        System.out.println("Total Salary: " + salary);
        
    }
    public void addEmployee(){}
}
