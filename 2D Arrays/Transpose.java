import java.util.*;

public class Transpose {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int m = SC.nextInt();

        int[][] matrix = new int[n][m];

        // input

        // rows
        for(int i=0; i<n; i++) {
            // colmuns
            for(int j=0; j<m; j++) {
                matrix[i][j] = SC.nextInt();
            }
        }
        System.out.println("The Transpose of a matrix is : ");
        // output
        for(int j=0; j<m; j++) {
            for(int i=0; i<n; i++) {
              System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}