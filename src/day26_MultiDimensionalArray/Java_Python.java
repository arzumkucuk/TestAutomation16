package day26_MultiDimensionalArray;

import java.util.Arrays;
import java.util.Locale;

/*
write a prog that can return the number of apperances of "java" and "python" anywhere in the sentence
        ex:
             input: I love Java, Phyton is cool
             output: 1 Java 1 Phyton

             input: Java Java Phyton Phyton Phyton
             output: 2 Java 3 Phyton

 */
public class Java_Python {

    public static void main(String[] args) {

        String sentence = "Java Java Phyton Phyton Phyton java java phyton phyton";
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));
        int countJava = 0;
        int countPhyton = 0;

        for (String each : words){
            if (each.toLowerCase().contains("java")){
                countJava++;
            }else if(each.toLowerCase().contains("phyton")){
                countPhyton++;
            }
        }
        System.out.println("Java: " + countJava);
        System.out.println("Phyton: " +countPhyton);

        /*


         */
    }
}
