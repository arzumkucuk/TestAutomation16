package Odevler;

import java.util.Scanner;

public class firstLast {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1= scan.next();

        System.out.println("Enter second word");
        String word2=scan.next();

        boolean same = word1.charAt(word1.length()-1) == word2.charAt(0);

        if (same){
            System.out.println(word1+word2.substring(1,word2.length()));
        }else{
            System.out.println("invalid");
        }

    }
}
