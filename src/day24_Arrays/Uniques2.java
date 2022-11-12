package day24_Arrays;

import java.util.Scanner;

public class Uniques2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String str=scan.nextLine();

        //String str = "aabcc";

        String expectedResult = "";

        for (int j=0; j<= str.length()-1; j++){ // because we need the frequency of every single character
            char ch1 =str.charAt(j);
            int count = 0;

            for (int i = 0; i <= str.length()-1; i++){ //  used for finding the frequency of ch and assign i
                char each = str.charAt(i); // a a b c c
                if (ch1 == each){
                    count++;

                }
            }

            if (count == 1) { // if it only occured one time
                expectedResult += ch1;
            }
        }
        System.out.println(expectedResult);

    }
}
