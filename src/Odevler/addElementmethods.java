package Odevler;

import java.util.Arrays;

public class addElementmethods {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40};
        addElement(arr,50);

    }



public static void addElement (int[] arr1, int num) {

    int[] result = new int[arr1.length+1];

    for (int i=0; i<=arr1.length-1; i++ ){
        result[i] = arr1[i];
    }

    result [result.length-1] =num;
    System.out.println(Arrays.toString(result));


}
    }