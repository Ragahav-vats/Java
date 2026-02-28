import java.util.*;

public class Age {
    public static void printAge(int age) {
         
         if(age > 18) {
            System.out.println("person eligible for vote");
         }
         else if(age < 18) {
           System.out.println("person not eligible for vote"); 
         }else {
            System.out.println("something went wrong");
         }
         return;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int age = SC.nextInt();

        printAge(age);
    }
}