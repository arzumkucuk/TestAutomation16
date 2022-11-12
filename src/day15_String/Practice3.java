package day15_String;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        // write a program enter your first name and last name
         //  print full name in all upper case

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName= scan.next();
        System.out.println("Enter your last name");
        String lastName=scan.next();

        String fullName=firstName+" " + lastName;
        fullName = fullName.toUpperCase();
        System.out.println(fullName);

    }
}
