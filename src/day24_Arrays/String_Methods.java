package day24_Arrays;

import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {

        String str = "ABCDEFGHIJ";

        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));

        System.out.println("==================================================");

        String str1="DCEBA";
        String str2="ADCBE";

        char[] ch1= str1.toCharArray(); // [D,C,E,B,A]
        char[] ch2= str2.toCharArray(); // [A,D,C,B,E]

        Arrays.sort(ch1); // [A,B,C,D,E]
        Arrays.sort(ch2); // [A,B,C,D,E]

        System.out.println(Arrays.equals(ch1,ch2));

        System.out.println("========================================");

        String sentence = "I Love Proggramming Language";

        // Language Programming Love I

        String [] words = sentence.split(" "); // {I, Love, Proggramming, Language}
        System.out.println( Arrays.toString(words));

        for (int i=words.length-1; i>=0; i--){
            System.out.println(words[i]+" ");

        }

        System.out.println("======================================");
        String s="JAVA";
        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));

        char[] c = s.toCharArray(); //every single elements are string
        System.out.println(Arrays.toString(c));

    }
}
