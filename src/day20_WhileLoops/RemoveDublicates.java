package day20_WhileLoops;

import java.util.Scanner;

public class RemoveDublicates {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = scan.nextLine(); // "aabb" --> ab

        String result ="";
/*
        for (int i=0; i<=str.length()-1; i++ ){
            String s = ""+str.charAt(i); // a, a, b, b
            if (result.contains(s)){ // if the character is already contained in result, we will not add it a
               continue;
            }
            result += s;
        }
        System.out.println(result);

 */

        for (int i = 0; i <=str.length()-1; i++){
            String s= ""+ str.charAt(i); // a, b, a, b
            if (!result.contains(s)){
                result += s;
            }
        }
        System.out.println(result);
    }
}
