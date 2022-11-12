package Odevler;

import java.util.Scanner;

public class dividenum2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=scan.nextInt();
        System.out.println("Enter second number");
        int num2= scan.nextInt();

        if (num2==0){
            System.out.println("Invalid number");
        }

        int count = 0;
        while (num1>=num2){

            num1 -= num2;

            count++;
        }
        System.out.println(count + " remainder of "+num1);
    }
}
