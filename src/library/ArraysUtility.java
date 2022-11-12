package library;

import java.util.Arrays;

public class ArraysUtility {
    /*
    returns the maximum number from an array of intiger
     */
    public static int max (int[] arr){
        int max = arr[0];

        for (int each : arr){
            if (each>max){
                max = each;
            }
        }
        return max;
    }

    /*
    returns the minimum number from an array of intiger
     */
    public static int min( int [] arr){

        int min = arr[0];
        for (int each : arr){
            if(each < min){
                min = each;
            }
        }
        return min;
    }

   /*
    returns the maximum number from an array of double
   */
    public static double max (double[] arr){
        double max = arr[0];

        for (double each : arr){
            if (each>max){
                max = each;
            }
        }
        return max;
    }


    /*
    returns the minimum number from an array of double
   */
    public static double min( double [] arr){

        double min = arr[0];
        for (double each : arr){
            if(each < min){
                min = each;
            }
        }
        return min;
    }

    /*
    combines two arrays of intigers and return the new array
     */
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

    public static char[] combinationTwoArrays (char[] arr1, char[] arr2){
        char[] arr3 = new char[ arr1.length + arr2.length ];

        int i = 0; // represents the index nums of arr3

        for (char each : arr1){
            arr3[i++] = each;
        }

        // i=2
        for (char each : arr2){
            arr3[i++] =each;

        }
        return arr3;
    }

    /*
    sort the array of integers in descending order, and returns it as an array
     */
    public static int[] sort(int[] arr){ //  {2,1,3}
        Arrays.sort(arr); // {1,2,3};
        int[] reversedArray = new int[arr.length];  // {3,2,1}

        for (int i=arr.length-1, j=0; i>=0; i--, j++){
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    } // sorts in descending order

    /*
    sort the array of double in descending order, and returns it as an array
     */
    public static double[] sort(double[] arr){ //  {2,1,3}
        Arrays.sort(arr); // {1,2,3};
        double[] reversedArray = new double[arr.length];  // {3,2,1}

        for (int i=arr.length-1, j=0; i>=0; i--, j++){
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

    /*
    sort the array of char in descending order, and returns it as an array
     */
    public static char[] sort(char[] arr){ //  {2,1,3}
        Arrays.sort(arr); // {1,2,3};
        char[] reversedArray = new char[arr.length];  // {3,2,1}

        for (int i=arr.length-1, j=0; i>=0; i--, j++){
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

    /*
    sort the array of String in descending order, and returns it as an array
     */
    public static String[] sort(String[] arr){
        Arrays.sort(arr); // {1,2,3};
        String[] reversedArray = new String[arr.length];  // {3,2,1}

        for (int i=arr.length-1, j=0; i>=0; i--, j++){
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

    /*
    replaces the [] with {} while printing the array
     */
    public static String printArray(int[] arr){
        String str = Arrays.toString(arr);
        str = str.replace("[","{").replace("]","}");
        return str;

    }

    /*
    adds element to the integer
     */
    public static int []  addElement (int[] array, int element){
        int[] result = new int[array.length + 1];

        for (int i=0; i<=array.length-1; i++){
            result[i] = array[i];
        }
        result[result.length-1] = element;

        return result;
    }

    /*
    adds element to the double
     */
    public static double []  addElement (double[] array, double element) {
        double[] result = new double[array.length + 1];

        for (int i = 0; i <= array.length - 1; i++) {
            result[i] = array[i];
        }
        result[result.length - 1] = element;

        return result;

    }

    public static char[]  addElement (char[] array, char element) {
        char[] result = new char[array.length + 1];

        for (int i = 0; i <= array.length - 1; i++) {
            result[i] = array[i];
        }
        result[result.length - 1] = element;

        return result;

    }

    public static String []  addElement (String[] array, String element) {
        String[] result = new String[array.length + 1];

        for (int i = 0; i <= array.length - 1; i++) {
            result[i] = array[i];
        }
        result[result.length - 1] = element;

        return result;

    }

}
