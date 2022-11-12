package Odevler;

import java.util.Scanner;

public class equalsWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = scan.next();

        System.out.println("Enter second word");
        String word2 = scan.next();

        if (word1.equalsIgnoreCase(word2)){
            System.out.println("Same words");
        }else{
            System.out.println("Diffirent words");
        }

    }
}
