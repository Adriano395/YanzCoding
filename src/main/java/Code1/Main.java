package Code1;
import java.util.Scanner;
import Code2.Calculation;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1;
        int num2;
    //  UI
        System.out.println("First Number: ");
        num1 = scn.nextInt();
        System.out.println("Second Number: ");
        num2 = scn.nextInt();
 
        Calculation calcution = new Calculation(num1, num2);
    }
}
