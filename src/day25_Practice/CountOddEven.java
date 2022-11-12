package day25_Practice;

public class CountOddEven {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        int countEven = 0;
        int countOdd  = 0;
        String even =""; // String ile tek tek even numberlari yazdiririz
        String odd ="";

        for (int each : nums){
            if (each%2==0){
                countEven++;
                even+=each+" ";

            }else {
                countOdd++;
                odd+=each+" ";
            }

        }
        System.out.println("Even numbers: "+countEven);
        System.out.println("Even: "+even);
        System.out.println("Odd numbers: " +countOdd);
        System.out.println("Odd: "+odd);

    }
}
