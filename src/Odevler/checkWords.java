package Odevler;

import java.util.Scanner;

public class checkWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String l1 = scan.next();
        System.out.println("Enter second word");
        String l2 = scan.next();
        System.out.println("Enter third word");
        String l3= scan.next();

        boolean allSame = l1.length() == l2.length() && l1.length()== l3.length()&& l2.length() == l3.length();
        boolean allDiff = l1.length() != l2.length() && l1.length() != l3.length() && l2.length() != l3.length();

        if (allSame){
            System.out.println("All same lenghts");
        }else if(allDiff){
            System.out.println("All diffrirent lenghts");
        }else {
            System.out.println("not same or diffirent");
        }


    }
}
