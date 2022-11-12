package day17_StringReview;

import java.util.Locale;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName= scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        firstName=firstName.toUpperCase();
        lastName=lastName.toUpperCase();

        String ch1= firstName.substring(0,1);
        String ch2=lastName.substring(0,1);

        System.out.println(ch1+ch2);





    }
}
