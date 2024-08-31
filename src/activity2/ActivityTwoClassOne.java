package activity2;

import java.util.Stack;


public class ActivityTwoClassOne {
    int maxSize;
    double[] stack;
    int top;
    Stack<Double> stacknew = new Stack<>();
    
    public ActivityTwoClassOne(int StackSize) {
        maxSize = StackSize;
        stack = new double[maxSize];
        top = -1;
    }
    public void pushData(double number) {
        if (!isFull()) {
            stack[++top] = number;
            System.out.println("Data Added to Stack!");
        }else{
            System.out.println("Stack Status; Full!"); 
            
        }
    }
    public void loopData() {
        if (isEmpty()) {
            System.out.println("Stack Status: Empty!");
        }else{
            System.out.println("Stack Status: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
                System.out.println("Loop Successful!");   
            }
        }
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
