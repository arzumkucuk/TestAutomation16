package Odevler;

public class ArraysOrnekler {
    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3}, {4,5,6,7,8}, {9,10,11,12,13} };
        /*
        for (int[] each1 : arr2D){
            for (int each : each1){
                System.out.print(each+"");
            }
            System.out.println();
        }
        */

        for (int i=arr2D.length-1; i>=0; i--){
            int[] arr1D = arr2D[i];
            for (int each : arr1D){
                System.out.print(each+" ");
            }
            System.out.println();
        }
    }
}
