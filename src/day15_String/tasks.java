package day15_String;

import java.util.Scanner;

public class tasks {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your sentence: ");

        String sentence = scan.nextLine();

        char firstCh= sentence.charAt(0);
        int lastIndex= sentence.length()-1;
        char lastCh= sentence.charAt(lastIndex);

        System.out.println(firstCh);
        System.out.println(lastCh);

    }
}
