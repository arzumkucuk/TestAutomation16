package day30_ReturnMethods;

import java.util.Arrays;

public class ReturnMethods3 {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        int maxNum = max(array); // 9
        System.out.println("max = " + maxNum);

        int max = max2(array);
        System.out.println("max = "+ max); // 9

        System.out.println(max > 100); // false

        int minNum = min(array); // 1
        System.out.println("min= " + minNum);
    }

    public static int max (int[] arr){
        int max = arr[0];

        for (int each : arr){
            if (each>max){
                max = each;
            }
        }
        return max;
    }

    public static int max2(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];

    }

    public static int min( int [] arr){

        int min = arr[0];
         for (int each : arr){
             if(each < min){
                 min = each;
             }
         }
        return min;
    }


}
