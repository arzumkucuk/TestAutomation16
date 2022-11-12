package day31_MethodOverLoading;

import java.util.Arrays;

public class MethodOverLoading5 {

    public static void main(String[] args) {

        double[] arr1 = {1.5, 3.5, 3.5};
        double[] arr2 = {4.5, 5.5, 6.5, 7.5};
        double[] arr3 = {8.5, 9.5};
        double[] arr4 = {10.5, 11.5, 12.5};

        double[] arr5 = combinationTwoArrays (combinationTwoArrays(arr1,arr2), combinationTwoArrays(arr3,arr4) );
        //              combineTwoArrays ( new Array, new Array )
        //              new array

        System.out.println(Arrays.toString(arr5));

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9};
        int[] a3 = {10,11};

        int[] a4 =combinationTwoArrays(  combinationTwoArrays(a1,a2), a3);

        System.out.println(Arrays.toString(a4));

        String[] group1 = { "Justin", "Adil", "Ercan", "Irina", "Med"};
        String[] group2= { "Sevgi", "Arzum", "Eda", "Ali", "Ahmet"};
        String[] group3 ={ "Natalie", "Jessica", "Eren", "Sulo", "Hakan"};
        String[] group4 = {"Asel", "Asli", "Halil", "Jimell", "Sofia", "Rauf"};
        String[] group5 = { "Ibo", "Ayse", "Fatma", "Melek", "Olly"};
        String[] group6= {"Yusuf", "DAn", "Saafir", "Muhtar", "Tina", "Mina"};

        String[] group1Andgroup2 = combinationTwoArrays(group1,group2);
        String[] group3Andgroup4 = combinationTwoArrays(group3,group4);
        String[] group5Andgroup6 = combinationTwoArrays(group5,group6);

        String[] cybertek = combinationTwoArrays( combinationTwoArrays(group1Andgroup2, group3Andgroup4), group5Andgroup6 );


        /*
        String[] cybertek = combinationTwoArrays(
                combinationTwoArrays(combinationTwoArrays(group1,group2), combinationTwoArrays(group3,group4)),
                        combinationTwoArrays(group5,group6) );

         */

        System.out.println(Arrays.toString(cybertek));
    }

    public static int[] combinationTwoArrays (int[] arr1, int[] arr2){
        int[] arr3 = new int[ arr1.length + arr2.length ];
        int i = 0; // represents the index nums of arr3

        for (int each : arr1){
            arr3[i++] = each;
        }

        // i=2
        for (int each : arr2){
            arr3[i++] =each;

        }
        return arr3;
    }

    public static double[] combinationTwoArrays (double[] arr1, double[] arr2){
        double[] arr3 = new double[ arr1.length + arr2.length ];

        int i = 0; // represents the index nums of arr3

        for (double each : arr1){
            arr3[i++] = each;
        }

        // i=2
        for (double each : arr2){
            arr3[i++] =each;

        }
        return arr3;
    }

    public static String[] combinationTwoArrays (String[] arr1, String[] arr2){
        String[] arr3 = new String[ arr1.length + arr2.length ];

        int i = 0; // represents the index nums of arr3

        for (String each : arr1){
            arr3[i++] = each;
        }

        // i=2
        for (String each : arr2){
            arr3[i++] =each;

        }
        return arr3;
    }




}
