package Code2;
import java.util.Scanner;

public class Calculation {
    public int num1;
    public int num2;
    public int ans;
    
    public Calculation(int num1, int num2){
        num1 = num1;
        num2 = num2;
        
        plus(num1,num2);
        subtract(num1,num2);
        multiply(num1,num2);
        divide(num1, num2);
        
    }
    public void plus(int num1, int num2){
        ans = num1 + num2;
        System.out.println("Addition Result: " + ans);
    }
    public void subtract(int num1, int num2){
        ans = num1 - num2;
        System.out.println("Subtraction Result: " + ans);
    }
     public void multiply(int num1, int num2){
        ans = num1 * num2;
        System.out.println("Multiplication Result: " + ans);
    }
    public void divide(int num1, int num2){
        if (num1 > num2){
            ans = num1 / num2;
            
        System.out.println("Division Result: " + ans);
        }else if(num1 < num2){
            ans = num2 / num1;
            
        System.out.println("Division Result: " + ans);
        }
    }
        
}

