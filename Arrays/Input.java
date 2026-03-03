import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int size = SC.nextInt();
        int numbers[] = new int[size];

        // input
        for(int i=0; i<size; i++) {
             numbers[i] = SC.nextInt();
        }
        // output
        for(int i=0; i<size; i++) {
            System.out.println(numbers[i]);
        }
    }
}