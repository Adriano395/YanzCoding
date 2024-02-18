package Activity2;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Activity_2 {
    public static void main(String[] args) {
        int[] num = {500,400,300,200,100};
        int totalvalue = (num[0]+num[1]+num[2]+num[3]+num[4]);
        
        
        System.out.println("Array Element:" + Arrays.toString(num));
        System.out.println("Sum of Elements:" + totalvalue);       
        int max = IntStream.of(num).max().orElse(Integer.MIN_VALUE);
        System.out.println("Maximum value: " + max);
    }
}