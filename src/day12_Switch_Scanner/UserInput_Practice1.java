package day12_Switch_Scanner;

import java.util.Scanner;

public class UserInput_Practice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");

        int number = scan.nextInt();

        if (number%2==0) {
            System.out.println("Even number");
        }else if (number%2!=0) {
            System.out.println("Odd number");
        }else {
            System.out.println("invalid");
        }


    }
}
