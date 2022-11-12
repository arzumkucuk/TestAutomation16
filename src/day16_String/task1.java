package day16_String;

import java.util.Scanner;

public class task1 {
    public static void main(String [] args) {
//      extra task
        String str ="I like drink Pepsi";
        String drink = str.substring(16);
        System.out.println(drink);

        String action = str.substring(10,14+1);
        System.out.println(action);

        System.out.println("========================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1= scan.next();
        System.out.println("Enter your second word");
        String word2= scan.next();


        String rest = word1.substring(0,word1.length());
        String rest2 = word2.substring(1,word2.length());

        System.out.println(rest+rest2);

    }
}
