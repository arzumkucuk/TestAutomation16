package day23_Arrays;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter two numbers");
            int num1= scan.nextInt();
            int num2= scan.nextInt();
            System.out.println("Enter the math operator");
            char o = scan.next().charAt(0);

        /*
            double result = (o =='+') ? num1+num2 : ( o == '-')? num1 - num2 :(o == '*')? num1*num2 :( o == '/') ? num1/num2
                    :( o == '%')? num1%num2 : 0;

            System.out.println(result);
        */

            switch (o){

                case '+':
                    System.out.println(num1+num2);
                    break;
                case '-':
                    System.out.println(num1-num2);
                    break;

                case '/':
                    System.out.println(num1/num2);
                    break;

                case '*':
                    System.out.println(num1*num2);
                    break;

                case '%':
                    System.out.println(num1%num2);
                    break;

                default:
                    System.out.println("Invalid Operator");

            }

            System.out.println("Do you want to continue?");
            String a = scan.next();

            while ( !(a.equals("yes") || a.equals("no")) ){ // while the answer is invalid
                System.out.println("Invalid answer, please enter yes or no");
                a =scan.next().toLowerCase();
            }

            if (a.equalsIgnoreCase("no")){
                break;
            }
        }


    }
}
