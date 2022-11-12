package Odevler;

import java.util.Scanner;

public class maxNum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num =999999999;
        for (int i=1; i<=5; i++){

            System.out.println("Enter a number");
            int min = scan.nextInt();

            if (min<num) {
                num = min;
            }

        }
        System.out.println(num );




    }
}
