package day14_Recap;

import java.util.Scanner;

public class nextLine_vs_Rest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        scan.nextLine(); // enter anlamina veya sor anlamina gelir, bu olmazsa asagidakileri direk sormadan yazar.

        System.out.println("Enter your full name: ");
        String name = scan.nextLine();

        System.out.println("Your age: "+age);
        System.out.println("Your full name is : "+ name);


    }

}
