import java.util.*;


public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    int size = SC.nextInt();
    String names[] = new String[size];

    // input
    for(int i=1; i<size; i++) {
         names[i] = SC.next();
    }

    // output
    for(int i=1; i<names.length; i++) {
        System.out.println("name : " + names[i]);
    }
}

