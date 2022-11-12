package Odevler;

import java.util.Scanner;

public class Polindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        String sum ="";

        for (int i = word.length()-1; i>=0; i--){

            sum += word.charAt(i);

        }

        System.out.println(sum);
    }
}
