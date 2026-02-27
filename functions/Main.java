import java.util.*;

public class Main {
    public static int calculateSum(int a,int b) {
      int sum=a+b;
      return sum;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();
        int b = SC.nextInt();

        int sum = calculateSum(a,b);
        System.out.println("sum of 2 numbers is : "+ sum);
    }
}