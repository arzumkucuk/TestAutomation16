package day16_String;

import java.util.Scanner;

public class task3 {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = scan.nextLine();

        int lenght = str.length();
        String result ="";

        if (lenght==0){
            result="Empty";
        }else if (lenght>=3){
            result=str.substring(str.length()-3,str.length());
        }else{
            result=str;
        }
        System.out.println(result);
    }
}
