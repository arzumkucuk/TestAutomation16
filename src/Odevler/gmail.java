package Odevler;

import java.util.Scanner;

public class gmail {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your gmail address");
        String gmail = scan.nextLine();

        boolean valid = gmail.endsWith("@gmail.com");

        if (valid){
            System.out.println("valid address");
        }else {
            System.out.println("invalid ");
        }
    }
}
