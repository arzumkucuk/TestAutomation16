package Odevler;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        double num1= scan.nextDouble();

        System.out.println("Enter your second number");
        double num2=scan.nextDouble();

        System.out.println("enter a math operator");
        char operator = scan.next().charAt(0);

        boolean valid = operator == '*' || operator =='/' || operator=='%' || operator == '-' || operator == '+';

        if (valid){

             switch (operator){
                 case '*':
                     System.out.println(num1*num2);
                     break;
                 case '/':
                     System.out.println(num1/num2);
                     break;
                 case '-':
                     System.out.println(num1-num2);
                     break;
                 case '+':
                     System.out.println(num1+num2);
                     break;
                 case '%':
                     System.out.println(num1%num2);
                     break;

             }

        }else {
            System.out.println("invalid");
        }




    }


}
