package day17_StringReview;

import java.util.Scanner;

public class task1_lastFirstcharSame {
    public static void main(String[] args) {
        /*
        Ask user to enter two words. then add them together and prrint. But if the last letter if the first word and
        the first letter of the last letter is the same, print that character once.
                input:
                       one
                       eight
                output:
                       oneight
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1=scan.next();

        System.out.println("Enter second word");
        String word2=scan.next();

        char ch1=word1.charAt(word1.length()-1);
        char ch2=word2.charAt(0);

        if (ch1==ch2){
            System.out.println(word1+word2.substring(1,word2.length()));
        }else {
            System.out.println("invalid");
        }









    }
}
