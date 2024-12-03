package jonelcode;
import java.util.Scanner;

public class JonelCode {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to Pisbok!");
        System.out.println("Enter User Population: ");
        int user = scn.nextInt();
       ClassB sub = new ClassB(user);
        boolean whatif = false;
        
        while(!whatif) {
            System.out.println("Number of friendships: ");
            int numfriends = scn.nextInt();
            System.out.println("Enter each friendship: ");
            for (int i = 0; i < numfriends; i++) {
                int ID1 = scn.nextInt();
                int ID2 = scn.nextInt();
                sub.add(ID1, ID2);
            }
            System.out.println("To get a friend suggestion Enter user ID: ");
            int userid = scn.nextInt();
            sub.print(userid);
            System.out.println("Want to Continue? (1 = YES. 2 = NO.)");
            System.out.println("NOTE: Please include space between the Users ID");
                    
            System.out.println("\n");
            int decision = scn.nextInt();
            
            switch (decision) {
                case 1:
                    break;
                case 2:
                    System.exit(decision);
                default:
                    System.out.println("Something went wrong.");
                    break;
            }
        }
    }
}
    
    

