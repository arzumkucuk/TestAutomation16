package day15_String;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String firstWord = scan.nextLine();
        System.out.println("Enter your second word");
        String secondWord = scan.nextLine();

        String fullWord=firstWord.concat(secondWord);
        System.out.println(fullWord);
    }
}
