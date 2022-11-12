package day20_WhileLoops;

import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        int fac = 1;

        for (int i=num; i>=1; i--){
            fac *= i;

        }
        System.out.println(fac);

    }
}
