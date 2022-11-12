package day19_ForLoop;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        String result ="";

        for (int i=word.length()-1; i>=0; i--){

            result += word.charAt(i);

        }
        if (result.equals(word)){
            System.out.println("This is palindrome");
        }else{
            System.out.println("false");
        }
        System.out.println(result);
    }
}
