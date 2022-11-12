package Odevler;

import java.util.Scanner;

public class inituals {
    public static void main(String[] args) {

        Scanner scan = new Scanner( System.in);
        System.out.println("Enter first name");
        String firstN = scan.next();
        System.out.println("Enter last name");
        String lastN= scan.next();

        String ch = firstN.substring(0,1);
        String ch2= lastN.substring(0,1);

        System.out.println(ch.toUpperCase()+"."+ch2.toUpperCase());
    }
}
