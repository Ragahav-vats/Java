import java.util.*;

public class Location {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int rows = SC.nextInt();
        int cols = SC.nextInt();

        int[][] numbers = new int[rows][cols];

        // input

        // rows
        for(int i=0; i<rows; i++) {
            // colmuns
            for(int j=0; j<cols; j++) {
                numbers[i][j] = SC.nextInt();
            }
        }
        
        int x = SC.nextInt();
        // output
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(numbers[i][j] == x) {
                    System.out.print("x found at location : (" + i + " , " + j + ")");
                }
            }
            System.out.println();
        }
    }
}