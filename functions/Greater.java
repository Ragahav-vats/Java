import java.util.*;

public class Greater {
public static void printGreater(int a, int b) {
     
     if(a > b) {
       System.out.println("a is greater than b : " + a);
     }
     else if(b > a) {
        System.out.println("b is greater than a : " + b);
     }else {
        System.out.println("Both are equal");
     }
     return;
}

public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    int a = SC.nextInt();
    int b = SC.nextInt();

    printGreater(a,b);
}
}