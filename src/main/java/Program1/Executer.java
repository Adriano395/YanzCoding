package Program1;
import java.util.Scanner;
import Program2.Calculate;

public class Executer {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Enter number: ");
        num1 = scn.nextInt();
        System.out.println("Enter number: ");
        num2 = scn.nextInt();
        
        Calculate cal = new Calculate(num1, num2);
    }
}
