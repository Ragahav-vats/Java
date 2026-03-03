import java.util.*;

public class Sorted {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int size = SC.nextInt();
        int numbers[] = new int[size];

        // input
        for(int i=0; i<size; i++) {
            numbers[i] = SC.nextInt();
        }

        boolean isAscending = true;

        // output
        for(int i=0; i<numbers.length-1; i++) {
            // condition for decending order
            if(numbers[i] > numbers[i+1]) {
                isAscending = false;
                break;
            }
        }
         if(isAscending) {
          System.out.println("The array is sorted in ascending order");
         }else {
          System.out.println("The array is not sorted in ascending order"); 
       }
    }
}