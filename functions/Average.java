import java.util.*;

public class Average {
    public static void printAverage(int a, int b, int c) {
        int average = (a+b+c)/3;
        System.out.println("the average of 3 no is : "+ average);
        return;
    }
     public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();
        int b = SC.nextInt();
        int c = SC.nextInt();

        printAverage(a,b,c);
     }
}