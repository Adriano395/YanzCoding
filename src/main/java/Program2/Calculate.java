package Program2;
import java.util.Scanner;

public class Calculate {
    public int num1;
    public int num2;
    public int anz;
    
    public Calculate(int num1, int num2){
        num1 = num1;
        num2 = num2;
        
        add(num1,num2);
        sub(num1,num2);
        times(num1,num2);
        div(num1, num2);
        
    }
    public void add(int num1, int num2){
        anz = num1 + num2;
        System.out.println("Addition: " + anz);
    }
    public void sub(int num1, int num2){
        anz = num1 - num2;
        System.out.println("Subtraction: " + anz);
    }
     public void times(int num1, int num2){
        anz = num1 * num2;
        System.out.println("Multiplication: " + anz);
    }
    public void div(int num1, int num2){
        if (num1 > num2){
            anz = num1 / num2;
        System.out.println("Addition: " + anz);
        }else if(num1 < num2){
            anz = num1 / num2;
        System.out.println("Addition: " + anz);
        }
    }
        
}

