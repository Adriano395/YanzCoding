/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jonelprojects2;

/**
 *
 * @author Student
 */
public class JonelProjects2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[] ambot = {1,2,3,4,5,6,7,8,9,10};
//        
//        System.out.println("Sum of all arrays are: ");
//        int ambot_sum = ambot[0] + ambot[1] + ambot[2] + ambot[3] + ambot[4];
//        System.out.println("Sum of All arrays: " + ambot_sum);
       
    //Find max
        int[] ambot = {500,5 ,10 ,20, 300, 499};
        int max = Math.max(ambot[2],ambot[1]);
        int max1 = Math.max(Math.max(ambot[0],ambot[2]), ambot[1]);
        int max2 = Math.max(ambot[0],Math.max(ambot[2],Math.max(ambot[3],Math.max(ambot[4], ambot[5] ))));
       
        System.out.println("Maximum Value "+ max);
    
    
    }    
       
}
