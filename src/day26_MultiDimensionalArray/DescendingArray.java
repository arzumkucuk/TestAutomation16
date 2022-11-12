package day26_MultiDimensionalArray;

import java.util.Arrays;

public class DescendingArray {
/*
write a program that can sort the array in descending order

ex:arr1: {10,11,8,9,12,5,15};

out put: arr2: {15,12,11,10,9,8,5}
 */
    public static void main(String[] args) {

        int [] arr1=  {10,11,8,9,12,5,15};

        int[] descending = new int[arr1.length];
        Arrays.sort(arr1);

        int index = arr1.length-1;

        for (int i=0; i<=arr1.length-1; i++){
            descending[i] = arr1[index];
            index--;

        }
        System.out.println(Arrays.toString(descending) );
    }
}
