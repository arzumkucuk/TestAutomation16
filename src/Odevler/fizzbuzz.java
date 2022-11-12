package Odevler;

import java.util.Scanner;

public class fizzbuzz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String firstword= scan.next();

        System.out.println("Enter second word");
        String secondword= scan.next();

        boolean valid = firstword.length() == 5 && secondword.length() == 5;

        if (valid){
            if (secondword.charAt(0)== firstword.charAt(firstword.length()-1)){
                System.out.println("Fizz");
            }else{
                System.out.println("buzz");
            }

        }else{
            System.out.println("invalid word");
        }



    }
}
