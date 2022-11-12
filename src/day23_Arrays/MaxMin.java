package day23_Arrays;

/*
int[] arr = {10,20,3,4,5,6,7,-1,-100,300,400}

write a program that can return the min and max number from the array


 */
public class MaxMin {

    public static void main(String[] args) {

        int[] arr = {5,5,4,3,6,4,1};

        int max = arr[0]; // 6
        int min = arr[0]; // 1

        for (int i=1; i<=arr.length-1; i++){  // i: 1, 2,3,4,5

            if (arr[i] > max){ // compares the array' elements and assign the number
                max = arr[i];
            }

            if (arr[i]< min){
                min = arr[i];
            }

        }
        System.out.println("Max number is: "+ max);
        System.out.println("Min number is: "+ min);

    }


}
