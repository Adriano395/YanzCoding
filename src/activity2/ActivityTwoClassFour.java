package activity2;

public class ActivityTwoClassFour extends ActivityTwoClassThree {
    
    public ActivityTwoClassFour(int Size) {
        super(Size);
    }
    
    public double peekTop() {
        if (!isEmpty()) {
            System.out.println("Peek Top Data Successful!");
            return stack[top];
            
        }else{
            System.out.println("Empty!");
            return -1;
        }
    }
    public double peekBot() {
        if (!isEmpty()) {
            System.out.println("Peek Bottom Data Successful!");
            return stack[0];
        }else{
            System.out.println("Empty!");
            return -1;
        }
    }
}
