package Odevler;

import java.util.Scanner;

public class credentials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username");
        String u = scan.nextLine();
        String validUser = "cyber";

        System.out.println("Enter password");
        String p = scan.next();
        String validPass = "Cyber123";

        int attempt =1;

        while (!u.equals(validUser) && !p.equals(validPass)){

            if (attempt>2){
                System.out.println("Your account locked");
                System.exit(0);
            }

            System.out.println("Invalid username or password.Please re-enter");
            System.out.println("Enter your username");
            p=scan.next();
            System.out.println("Enter your password");
            u=scan.next();

            attempt++;
        }

        System.out.println("Logged in");
    }
}
