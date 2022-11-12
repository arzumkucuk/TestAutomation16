package replit;

import java.util.Scanner;

public class R_21 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first number");
        int num1= scan.nextInt();
        System.out.println("Enter second number");
        int num2=scan.nextInt();
        System.out.println("Enter third number");
        int num3=scan.nextInt();

        int sum= num1+num2+num3;

        System.out.println("Sum Of Numbers: " + sum);


    }
}
