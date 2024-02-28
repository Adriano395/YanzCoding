package Activity6;
import java.util.Scanner;

 
public class Activity_6 {
    public static void main (String[]args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter a single digit: ");
        int number = scn.nextInt();
        scn.nextLine(); 

        System.out.println("Multiplication table: " + number );
        for (int i = 1; i <= 10; i++) {
        System.out.println(number + " x " + i + " = " + (number * i));
        scn.close();
        
        }
    }
}

