package day12_Switch_Scanner;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter your first number:");

        double firstNum= num1.nextDouble();

        System.out.println("Second number:");
        double secondNum=num1.nextDouble();

        double sum = (firstNum+secondNum);
        System.out.println("Sum is: "+sum);




    }


}
