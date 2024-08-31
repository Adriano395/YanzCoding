package activity2;

//shessssshhhhhhhh
public class ActivityTwoClassTwo extends ActivityTwoClassOne {
    
    public ActivityTwoClassTwo(int StackSize) {
        super(StackSize);
    }
    public void count() {
        if (!isEmpty()) {
            int sum = top + 1;
            System.out.println("Total Elements: " + sum);
            System.out.println("Count Elements Successful! ");
        }else{
            System.out.println("Stack Status: Empty.");
        }
    }
}
