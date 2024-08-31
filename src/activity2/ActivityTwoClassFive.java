package activity2;


//hee heeeee
public class ActivityTwoClassFive extends ActivityTwoClassFour {
    
    public ActivityTwoClassFive(int Size) {
        super(Size);
    }
    
    public void addStack() {
        for (int i = 0; i <= top; i++) {
            if (!isFull()) {
                System.out.println("Stack Added: " + stack[i]);
                stacknew.push(stack[i]);
                System.out.println("New Stack Added!");
            }else{
                System.out.println("Stack Status: Full!");
            }
        }
    }
}
