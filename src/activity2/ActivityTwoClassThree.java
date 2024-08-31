package activity2;

import java.util.HashSet;
import java.util.Set;

//poya eyyyyyyyyy
public class ActivityTwoClassThree extends ActivityTwoClassTwo {
    
    public ActivityTwoClassThree(int StackSize) {
        super(StackSize);
    }
    public void removeDuplicates() {
        Set<Double> remdup = new HashSet<>();
        int Top = -1;
        boolean duplicate = false;
        for (int i = 0; i <= top; i++) {
            if (remdup.contains(stack[i])) {
                System.out.println("Positive Duplicate: " + stack[i]);
                stack[++Top] = stack[i];
                top = Top;
                duplicate = true;
            }remdup.add(stack[i]);
             System.out.println("Duplicates Removed.");
             System.out.println(" ");
        }if (duplicate == false){
            System.out.println("Negative Duplicates.");
        }
    }
}
