import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();
        int b = SC.nextInt();

        if(a == b) {
            System.out.println("Equal");
        } 
        else if(a > b) {
            System.out.println("a is greater");
        }
        else{
            System.out.println("a is lesser");
        }
    }
}