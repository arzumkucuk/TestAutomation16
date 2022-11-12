package day27_recap;

import java.util.Arrays;

public class ArraysUtility {
    /*
    sort():
    toString():
    equals():

     */

    public static void main(String[] args) {
        // sort

        String[] names = {"Odina","Liliia","Berk","Emine"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        int[] score = {80,75,65,110,90,45,56,78};

        Arrays.sort(score);
        System.out.println(Arrays.toString(score));

        System.out.println("Maximum: "+ score[score.length-1]);
        System.out.println("Minimum: "+ score[0]);

        System.out.println("=================================================");

        // equals

        String[] s1 ={"A", "B", "C"};
        String[] s2 ={"A", "B", "C"};

        System.out.println( Arrays.equals(s1,s2)  );

        String[] s3 ={"C", "B", "A"};
        System.out.println(Arrays.equals(s1,s3)  ); // false

        String[] a1 = {"A", "C", "B"};
        String[] a2 = {"B", "A", "C"};

        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.equals(a1,a2) ); // true because we used sort

        // toString

        String w1 = Arrays.toString(a1);
        System.out.println(w1);


    }
}
