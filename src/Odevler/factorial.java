package Odevler;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        int fac = 1;

        for (int i = num; i>=1; i--){
            fac *= i;

        }
        System.out.println(fac);

        // reverse string

        String s = "Eren ile Arzum evlendi";
        String[] word = s.split(" ");

        for (int i=word.length-1; i>=0; i--){
            System.out.print(word[i]+" ");

        }
        System.out.println();

        for (int i=s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i)+"");
        }
    }
}
