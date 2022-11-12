package day16_String;

import java.util.Scanner;

public class CheckWords {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String word = scan.next();
        System.out.println("Enter your second word");
        String word2=scan.next();
        System.out.println("Enter your third word");
        String word3=scan.next();
         int l1=word.length();
         int l2=word2.length();
         int l3=word3.length();
         String result ="";


        if (l1==l2 && l1==l3){
            result="All words are same lenght";
        }else if(l1 != l2 && l1 != l3 && l2!=l3){
            result="All diffirent lenghts";
        }else {
            result="Not same or Diffirent lenghts ";
        }
        System.out.println(result);

        // 2. YOL olabilir

        boolean allSame = word.length()== word2.length() && word.length()==word3.length();
        boolean allDiffirent = word.length() != word2.length() && word.length() !=word3.length() && word2.length() != word3.length();

        if (allSame){
            result = "All same lenght";
        }else if (allDiffirent){
            result="All diffirent lenghts";
        }else {
            result="Not same or Diffirent lenghts ";
        }
        System.out.println(result);
    }
}
