package day14_Recap;

import java.util.Scanner;

public class practice2 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your score:");
        int score = scan.nextInt();

        String result ="";
        if (score<=100 && score > 0){

            if (score>=90){
                result="Excelent";
            } else if (score>=80){
                result="Great";
            }else if (score>=70){
                result="Good";
            }else if (score>=60){
                result="Passed";
            }else{
                result="Failed";
            }

        }else{
            System.out.println("Invalid number");
        }
        System.out.println(result);

        System.out.println("==============");

        boolean resultA= 9 >= 9 || 10<= 10;
        boolean resultB = 'A' >= 128 && 'B' < 128;

        if (resultA){
            if (resultB){
                System.out.println(resultA);
            }else{
                System.out.println(resultB);
            }
        }



    }
}
