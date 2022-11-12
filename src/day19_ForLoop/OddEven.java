package day19_ForLoop;

public class OddEven {

    public static void main(String[] args) {
        // 1 3 5 7 9 11 13 ... 99 divisible 3 & 5

         for (int i=1; i<= 99; i += 2 ){

              if (i % 3== 0 && i %5 == 0) {
                  System.out.print(i+" ");
              }
         }
        System.out.println();
         // 0 2 4 6 8 10 .... 100 divisible 3 & 5

         for (int j = 0; j <= 100; j ++){

             if(j % 2 == 0 ){ // pre: j MUST be odd number
                if ( j % 3== 0 && j % 5== 0){ // sub: MUST  be divisible by 3 & 5
                    System.out.print(j + " ");
                }
             }
         }

        System.out.println();



    }
}
