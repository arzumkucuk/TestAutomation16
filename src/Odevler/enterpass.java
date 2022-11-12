package Odevler;

import java.util.Scanner;

public class enterpass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your password");
        String password = "Cybertek123";
        String str = scan.nextLine();


        while(!str.equals(password)){

            System.out.println("Please re-enter your password");
            str = scan.nextLine();


        }
        System.out.println("Logged in");




    }
}
