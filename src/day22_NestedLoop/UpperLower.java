package day22_NestedLoop;

import java.util.Scanner;

public class UpperLower {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = scan.nextLine();

        char ch1 = word.charAt(0);
        char ch2 = word.charAt(word.length()-1);

        if (ch1 >='A' && ch1<='Z' && ch2>='a' && ch2<='z'){
            System.out.println("true");
        }else {
            System.out.println("false");
        }




    }
}
