package Odevler;

import java.util.Scanner;

public class employer {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Are you employeed?");
        String employer = scan.next();

        if (employer.equalsIgnoreCase("yes")){
            System.out.println("employeed");
        }else {
            System.out.println("not employeed");
        }
    }
}
