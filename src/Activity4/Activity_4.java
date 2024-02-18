package Activity4;
import java.util.Scanner;

public class Activity_4 {
    public static void main (String[]args){  
        Scanner scn = new Scanner(System.in);
        int i = 0;
        while (i<1) {   
            
            int score;

            System.out.println("Hello");
            System.out.println("Enter Entrance Score: ");
            score = scn.nextInt();


            if  (score >= 70){
                double Gpa = 3.5;
                System.out.println("Your GPA is above "+ Gpa  );
                System.out.println("You are eligible for addmission");
            } else if(score <= 70) {
                double Gpa = 3.0;
                System.out.println("Your GPA is below "+ Gpa);
                System.out.println("You are not eligible for addmission ");

                }
            
        }
        scn.close();
    }
}
