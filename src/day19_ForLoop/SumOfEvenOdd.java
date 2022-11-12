package day19_ForLoop;

public class SumOfEvenOdd {
    public static void main(String[] args) {

        int sum = 0;

        for (int a = 0; a<=100; a+= 2 ){

            sum += a;

        }

        System.out.println(sum);

        System.out.println("----------------------");

        int sum2 = 0;
/*
        for ( int i = 1; i<=100; i += 2){
            sum2 += i;
        }
        System.out.println(sum2);

 */

        for (int i = 0; i<= 100; i++){
            if (i % 2 != 0) {
                sum2 += i;
            }
        }
        System.out.println(sum2);
    }
}
