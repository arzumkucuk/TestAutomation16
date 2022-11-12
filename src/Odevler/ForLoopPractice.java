package Odevler;

import java.util.Scanner;

public class ForLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= scan.nextInt();

        int sum = 0;

        for (int i=1; i<=num; i++){

            sum += i;

        }

        System.out.println(sum);

        System.out.println();

        int num1= 100;

        int sum1 =0;

        for (int i=1; i<=num1; i+=2){

            sum1 += i;

        }
        System.out.println(sum1);


    }
}
