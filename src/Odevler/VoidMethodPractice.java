package Odevler;

public class VoidMethodPractice {

    public static void main(String[] args) {

        int[] arr = {10,30,60,5,5,10,30};
        arrMaxNum(arr);

        arrMinNum(arr);

        uniqueElement(arr);
    }


    public static void arrMaxNum (int[] arr){

        int max = arr[0];

        for (int each : arr){
            if (each>max){
                max=each;
            }
        }
        System.out.println("Max num:"+ max);

    }
    public static void arrMinNum (int[] arr){

        int min = arr[0];

        for (int each : arr){
            if (each<min){
                min = each;
            }
        }
        System.out.println("min num:"+ min);
    }

    public static void uniqueElement (int[] arr) {


        for (int each : arr) {
            int count = 0;
            for (int each2 : arr) {
                if (each == each2) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each + " ");
            }

        }
        System.out.println();
    }
}
