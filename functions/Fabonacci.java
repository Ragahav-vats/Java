import java.util.*;

public class Fabonacci {
    public static void printFabonacci(int n) {
        int a=0;
        int b=1;
        int c;

        for(int i=1; i<=n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        printFabonacci(n);
    }
}