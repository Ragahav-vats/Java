import java.util.*;

public class Odd {
public static void printOdd(int n) {
    int sum = 0;

   for(int i=1; i<=n; i++) {
      if(i % 2 != 0) {
        sum = sum+i;
    }
   }
   System.out.println("Total sum of odd no is : " + sum);
}
public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    int n = SC.nextInt();

    printOdd(n);
}
}