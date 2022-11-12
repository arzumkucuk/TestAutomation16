package day24_Arrays;

/*
 write a program  that can print out the unique numbers from an array of integers

 Ex:
    int[] arr = {1,1,2,3,3}

    output:  2 4

  2. write a program that can combine two arrays of integers and then print out the maximum number

 Ex:
    arr1 = {1,2,3,4}
    arr2 = {5,6,7,8}

    output: {1 2 3 4 5 6 7 8}
    max: 8
 */

public class Unique_EachLoop {

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4};
        //String result="";

        for (int each:arr){
            int count=0;

            for (int unique : arr){
                if (each==unique){
                    count++;
                }
            }
            if (count==1){
                System.out.print(each+" ");
            }

        }
        //System.out.println(result);



    }
}
