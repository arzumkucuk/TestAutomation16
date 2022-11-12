package day23_Arrays;

import java.util.Scanner;

public class Addition {
    /*
    if the answer yes, repat the whole process again
    if the answer no, only return addition
    but while the answer neither yes or no, the program should repeatedly ask the user re-enter

    hint: nested loop, outer loop need to be an infinite loop
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter two numbers");
            int num1= scan.nextInt();
            int num2= scan.nextInt();
            int result = num1+num2;

            System.out.println(result);

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
