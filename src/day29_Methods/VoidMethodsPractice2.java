package day29_Methods;

import java.util.Scanner;

public class VoidMethodsPractice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        sumOf3Nums(10,20,30);
        sumOf3Nums(40,30,10);

       // sumOf3Nums(scan.nextInt(),scan.nextInt(), scan.nextInt();

        greaterNum(100,100);
    }
    public static void sumOf3Nums (int n1, int n2, int n3) { System.out.println("Sum is: "+ (n1+n2+n3));  }

    public static void greaterNum (int n1, int n2){

        if ( n1> n2){
            System.out.println(n1+ " is greater");
        }else if (n2>n1){
            System.out.println(n2+ " is greater");
        }else{
            System.out.println("Equal");
        }
    }


}
/*
1. write a method that calculates the sum of 2 nums
2. write a method that shows the greater number from 2 numbers
 */
