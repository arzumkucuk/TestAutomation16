package day24_Arrays;
/*

write a program that can return the avarage number from an array of integers

ex:
    [1,2,3]
    avarage: 2

    [10,15,5,6]
    avarage: 9

 */
public class Avarage {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        double sum = 0;

        for (int i=0; i<=arr.length-1; i++){

            sum += arr[i];

        }
        System.out.println("Sum: "+ sum);
        System.out.println("Avarage: " + sum/arr.length);
    }
}
