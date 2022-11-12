package day14_Recap;

import java.util.Scanner;
import java.util.SortedMap;

public class task_scannermethods {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your gender:");
        String gender = scan.next();

         scan.nextLine();

        System.out.println("Enter your age:");
         int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your country name:");
        String country = scan.nextLine();

        //scan.nextLine();

        System.out.println("Enter your zip code:");
        int zip = scan.nextInt();


        scan.nextLine();

        System.out.println("Enter your full name:");
        String fullName= scan.nextLine();


        System.out.println("Enter your company name:");
        String company = scan.nextLine();

        System.out.println("Gender : "+ gender);
        System.out.println("Age: "+ age);
        System.out.println("Country: "+country);
        System.out.println("Zip code: "+zip);
        System.out.println("Full Name: "+fullName);
        System.out.println("Company name: "+ company);


    }
}
