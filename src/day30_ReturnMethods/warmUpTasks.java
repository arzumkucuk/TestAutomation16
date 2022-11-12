package day30_ReturnMethods;

import java.util.Arrays;
import java.util.Locale;

public class warmUpTasks {
    //1. create a function that can check if the given intiger is positive, negative or zero
    //2. create a function that can calculate the grade of the student
    //3. create a function that can print out the combination of two intiger arrays
    //4. create a function that can print a string without the dublicated characters
    //            "aaabbbccc"
    //             abc
    //5. write a method that can print out the full name of a person in regular format

    //      ex:  fullname("cYbErTeK", "SCHOOL");
    //
    //           output:  "Cybertek School"



    //==================================================================
    public static void main(String[] args) {

        positiveNegativeZero(123);
        positiveNegativeZero(0);
        positiveNegativeZero(-2);

        int[] numbers = {1,2,3,4,-5,-6,-7,-8,10,11,0};

        for ( int each : numbers){
            positiveNegativeZero(each);
        }
        System.out.println("=================================================");

        gradeCalculator(85);
        // gradeCalculator(-75); // invalid score

        System.out.println("=================================================");

        int[] a1 = {10,50,60,70};
        int[] a2 = {20,90,100};

        combinationTwoArrays(a1,a2);

        System.out.println("=================================================");

        removeDuplicates("aaaaabbbbbffffffccccsssssffff");

        System.out.println("=================================================");

        formattedFullName("cYBeRtek", "sChOOl");

    }
    // TASK1:
    public static void positiveNegativeZero(int number){
        String result= (number>0) ? "Positive" : (number<0) ? "Negative" : "Zero";
        System.out.println(number+" is "+result);
    }

    // TASK2:
    public static void gradeCalculator (int score){
        if (score >= 0 && score <= 100){

          if (score>=90){
              System.out.println("A");
          }else if (score>=80){
              System.out.println("B");
          }else if (score>=70){
              System.out.println("C");
          }else if (score>=60){
              System.out.println("D");
          }else{
              System.out.println("F");
          }
          //  System.out.println( (score>=90)? 'A' :(score >=80) ? 'B' :(score>=70)? 'C' :(score>=60)? 'D' :'F' );

        }else {
            System.err.println("Invalid Score");
        }

    }

    // TASK3:                                  {1,2}       {3,4,5}
    public static void combinationTwoArrays (int[] arr1, int[] arr2){
        int[] arr3 = new int[ arr1.length + arr2.length ];
        int i = 0; // represents the index nums of arr3

        for (int each : arr1){
            arr3[i++] = each;
        }

        // i=2
        for (int each : arr2){
            arr3[i++] =each;

        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    // TASK4:                               "aabccb"
    public static void removeDuplicates (String str ){
        String result = ""; //  "abc"

        for (String each : str.split("")){  // each : [a,a,b,c,c,b] each loop yapabilmek icin bu sekilde array yapmak gerek
            if (!result.contains(""+each)){
                result+=each; // continiue;
                             //  }else{
                            // result += each ==> bu sekilde yazarsan resultun onunden ! kaldirirsin
            }
        }
        System.out.println(result);
    }
    // TASK5:                              "cYbERteK" ,       "sChoOL"
    public static void formattedFullName (String firstName, String lastName){
        firstName = firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase(); // "Cybertek"
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase(); // School
        System.out.println(firstName+" "+lastName);
    }


}
