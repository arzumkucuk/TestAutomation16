package Odevler;

import java.util.Scanner;

public class Tekrar_day15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        firstName = firstName.substring(0,1);
        lastName = lastName.substring(0,1);

        System.out.println(firstName+"."+lastName);




    }
}
