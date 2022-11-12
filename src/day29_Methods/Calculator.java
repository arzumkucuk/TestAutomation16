package day29_Methods;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        calculator(12,'/',3);
       // System.out.println("Enter input"); // istersen soru sorarsin
      //  calculator(scan.nextDouble(), scan.next().charAt(0), scan.nextDouble());


    }

    public static void calculator (double n1, char operator, double n2){

        double result=0;
        boolean isValid = operator == '+' || operator=='-' || operator=='*' || operator=='/' || operator=='%';

        if (isValid){
            {
                switch (operator){
                    case '+':
                        result=n1+n2;
                        break;
                    case '-':
                        result=n1-n2;
                        break;
                    case '/':
                        result=n1/n2;
                        break;
                    case '*':
                        result= n1*n2;
                        break;
                    case '%':
                        result=n1%n2;
                        break;

                }
                System.out.println(result);
            }
            /*
            System.out.println(      (operator=='+') ? "Addition: "+(n1+n2) : (operator=='-')? "Subtraction: "+(n1-n2)
                    : (operator=='*')? "Multiplication: "+ (n1*n2) : (operator=='/')? "Division: "+(n1/n2):"Remainder: "+(n1%n2)
            );

             */
        }else {
            System.err.println("Invalid Operator");
        }
    }


}
