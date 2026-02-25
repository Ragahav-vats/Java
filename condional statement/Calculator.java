import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Enter a first Number: ");
        int a = SC.nextInt();
        System.out.println("Enter a second Number: ");
        int b = SC.nextInt();


        int add = a + b ;
        int sub = a - b ;
        int mul = a * b ;
        int div = a % b ;

        System.out.println("Enter your choice: ");
        int n = SC.nextInt();

        switch(n) {
            case 1 : System.out.println("Addition = " + add);
            break;
            case 2 : System.out.println("Subtraction = " + sub);
            break;
            case 3 : System.out.println("Multiplication = " + mul);
            break;
            case 4 : System.out.println("Division = " + div);
            break;
            default : System.out.println("No Result");
        }
    }
}