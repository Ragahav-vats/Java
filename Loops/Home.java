import java.util.*;

public class Home {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = SC.nextInt();
            
            if(marks>=0 && marks <=59) {
                System.out.println("This is good as weel");
            }
            else if(marks>=60 && marks <=89) {
                System.out.println("This is also good");
            }
            else if(marks>=90 && marks <=100) {
                System.out.println("This is good");
            }
            else {
                System.out.println("wrong Marks");
            }
        
    }
}