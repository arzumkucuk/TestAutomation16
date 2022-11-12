package day15_String;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class substring_method {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        //                 0123456789..

        // substring (beg index , end index) ==> ending index excluded
        String word = sentence.substring(0 , 3); // 0,1,2 character prints
        System.out.println(word);

        String word2 = sentence.substring(8 , 11);
        System.out.println(word2);

        System.out.println("=====================================");

        String sentence2 = "I like Movies and TV Series";
        //                  0123456789...
        String word3= sentence2.substring(7,13);
        System.out.println(word3); // Movies

        System.out.println("=====================================");

        String firstName = "mUhTaR";
        String firstCharacter = firstName.substring(0,1);
        String rest = firstName.substring(1, firstName.length()); // firstName.length() : lastIndex +1

        firstName = firstCharacter.toUpperCase() + rest.toLowerCase();

        System.out.println(firstCharacter);
        System.out.println(rest);

        System.out.println(firstName);


    }
}
