import java.util.*;

public class Circumference {
    public static void printArea(int r) {

        double area = 2*(22.0/7*r);
        System.out.println("area of circle is : " + area);
        return;
    }
    
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int r = SC.nextInt();

        printArea(r);
    }
}