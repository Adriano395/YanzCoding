package Activity3;
import java.util.Scanner;


public class Activity_3 {
    public static void main (String[]args){
        Scanner scn = new Scanner (System.in);
        double celcius ;
        
        System.out.println("Enter a temperature in Celcius: ");
        celcius = scn.nextDouble();

        double fahrenheit = (celcius * 9/5+32);
        System.out.println("Converted temperature: " + fahrenheit + "°F");
        System.out.println(celcius + "°C is equal to "+ fahrenheit + "°F");
        scn.close();
    }
    
}
