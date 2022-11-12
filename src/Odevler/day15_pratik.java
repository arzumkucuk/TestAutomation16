package Odevler;

import java.util.Locale;
import java.util.Scanner;

public class day15_pratik {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstN=scan.next();
        System.out.println("Enter your last name");
        String lastN=scan.next();

        String fullN =firstN+" "+lastN;

        System.out.println(fullN.toUpperCase());




    }
}
