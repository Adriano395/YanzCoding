
package activity2;
import java.util.Scanner;
/**
 *
 * @author Rhodz
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int stacksize;
        int desire;
        boolean whatif= false;
        System.out.println("Enter A Valid Stack Size: ");
        stacksize = scn.nextInt();
        ActivityTwoClassFive stack = new ActivityTwoClassFive(stacksize);
        System.out.println("Stack Size: " + stacksize);
        
        while(!whatif) {
            System.out.println(" Select Desired Function below:");
            System.out.println(" Push Data.                 [1]");
            System.out.println(" Peek Top Data.             [2]");
            System.out.println(" Peek Bottom Data.          [3]");
            System.out.println(" Loop Stack.                [4]");
            System.out.println(" Count Element.             [5]");
            System.out.println(" Remove Duplited Data.      [6]");
            System.out.println(" Add Stack To NewStack.     [7]");
            System.out.println(" Terminate Program.          [0].");
            System.out.println("Select: ");
            desire = scn.nextInt();
            
            switch (desire) {
                case 1: 
                    System.out.println("Input Value to Push: ");
                    int push = scn.nextInt();
                    stack.pushData(push);
                    break;
                case 2:
                    System.out.println("Top Data: " + stack.peekTop());
                    break;
                case 3:
                    System.out.println("Bottom Data: " + stack.peekBot());
                    break;
                case 4: 
                    stack.loopData();
                    break;
                case 5:
                    stack.count();
                    break;
                case 6:
                    stack.removeDuplicates();
                    break;
                case 7:
                    stack.addStack();
                    break;
                case 0:
                    System.exit(desire);
                default:
                    System.out.println("Invalid Input!");
                    whatif = false;
                    break;
            }
        }
    }
    
}
