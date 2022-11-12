package day16_String;

import java.util.Scanner;

public class validGmail {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your gmail address");
        String gmail = scan.nextLine();

        boolean valid = gmail.endsWith("@gmail.com");

        if (valid){
            System.out.println("Valid gmail address");
        }else {
            System.out.println("Invalid");
        }
        System.out.println("===========================");

        System.out.println("Enter your website");

        String website = scan.nextLine();

        if (website.startsWith("www.")){
            System.out.println("valid website");
        }else{
            System.out.println("invalid website");
        }





    }
}
