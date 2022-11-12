package day15_String;

import java.util.Locale;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName= scan.next(); // Cybertek

        System.out.println("Enter your last name: ");
        String lastName = scan.next(); // School

        // String fullName = firstName.concat(" " .concat(lastName) ); // Cybertek School
        String fullName = firstName + " " + lastName;

        // System.out.println("Your full name is: ".concat(fullName));

        System.out.println("Your full name is : "+ fullName);







    }
}
