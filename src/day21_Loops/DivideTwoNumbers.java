package day21_Loops;

import java.util.Scanner;

public class    DivideTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scan.nextInt();
        System.out.println("enter a number");
        int b = scan.nextInt();


        int count = 0;
        while (a >= b){

            a -= b;

            count++;

        }
        System.out.println(count+ " with a remainder of "+ a);
    }
}
