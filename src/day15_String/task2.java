package day15_String;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String word1 = scan.nextLine();
        System.out.println("Enter your second sentence");
        String word2= scan.nextLine();

        int num1 = word1.length();
        int num2 = word2.length();
        String result="";

        if (num1>num2){
            result=word1;
        }else {
            result=word2;
        }
        System.out.println(result);

    }
}
