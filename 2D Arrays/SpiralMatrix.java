import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int m = SC.nextInt();
        int n = SC.nextInt();

        int matrix[][] = new int[m][n];

        // input
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = SC.nextInt();
            }
        }

        System.out.println("The spiral order matrix is : ");

        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        while(rowStart <= rowEnd && colStart <= colEnd) {
            // upper

            for(int j=colStart; j<=colEnd; j++) {
                System.out.print(" " + matrix[j][rowStart]);
            }
            rowStart++;

            // right

            for(int i=rowStart+1; i<=rowEnd; i++) {
                System.out.print(" " + matrix[i][colEnd]);
            }
            colEnd--;

            // bottom

            for(int j=colEnd-1; j>=colStart; j--) {
                if(rowStart == rowEnd) {
                    break;
                }
                System.out.print(" " + matrix[j][rowEnd]);
            }
            rowEnd--;

            //left

            for(int i=rowEnd-1; i>=rowStart+1; i--) {
                  if(colStart == colEnd) {
                    break;
                }
                System.out.print(" " + matrix[i][colStart]);
            }
            colStart++;

            System.out.println();
        }
    }
}