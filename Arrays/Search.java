import java.util.*;

public class Search {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        // int size = SC.nextInt();
        int numbers[] = new int[size];

        // input
        for(int i=0; i<numbers.length; i++) {
             numbers[i] = SC.nextInt();
        }
        
        int x = SC.nextInt();

        // output
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == x) {
                System.out.println("x found at index : " + i);
            }
        }
    }
}