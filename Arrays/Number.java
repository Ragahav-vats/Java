import java.util.*;

public class Number {
    public static void main(String[] args) {
        Scanner SC =  new Scanner(System.in);
        int size = SC.nextInt();
        int numbers[] = new int[size];

        // input
        for(int i=0; i<size; i++) {
            numbers[i] = SC.nextInt();
        }  

      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;

        // output
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("max no is : " + max);
        System.out.println("min no is : " + min);
    }
}