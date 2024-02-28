package Activity5;
import java.util.Scanner;

public class Activity_5 {
    public static void main (String[]args){
        Scanner scn = new Scanner (System.in);
        
        
        int sourceCurrency;
        int targetCurrency;
        double value;
        
        
        System.out.println("Enter Value: ");
        value = scn.nextDouble();
        System.out.println("Choose a Currency: ");
        System.out.println("1. Dollar"+ "\n2. Pound"+ "\n3. Peso");
        sourceCurrency = scn.nextInt();
        System.out.println("Choose Currency to converted:"+"\n1. Dollar"+ "\n2. Pound"+ "\n3. Peso");
        targetCurrency = scn.nextInt();
        scn.close();
        
        int num = sourceCurrency;
        double result;
        switch (num){
        case 1:
            //dollar
            int dollar = targetCurrency;
            switch (dollar){
                case 1:
                // dollar to pound
                result = value * 0.79;
                System.out.println("Converted Value is "+ result);
                break;
                case 2:
                // dollar to peso
                result = value * 56.01;
                System.out.println("Converted Value is "+ result);
            }
        break;        
           
        case 2:
            // pound
            int pound = targetCurrency;
            switch (pound){
                case 1:
                //pound to dollar
                result = value * 1.27;
                System.out.println("Converted Value is "+ result);
                break;
                case 2:
                //pound to peso
                result = value * 71.10;
                System.out.println("Converted Value is "+ result);
            }    
        break;        
            
            
        case 3:
            //peso
            int peso = targetCurrency;
            switch (peso){
                case 1:
                //peso to dollar
                result = value * 0.018;
                System.out.println("Converted Value is "+ result);
                break;
                case 2:
                //peso to pound
                result = value * 0.014;
                System.out.println("Converted Value is "+ result);
                break;
            }
        break;    
        
        }
    }
}