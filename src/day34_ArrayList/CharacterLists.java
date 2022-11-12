package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CharacterLists {

    public static void main(String[] args) {

        String str = "abc!@#$ety123hfghftt%*(^&890";

        ArrayList<String> digits = new ArrayList<>(Arrays.asList( str.split("") ) );
        digits.removeIf( p -> !Character.isDigit(p.charAt(0) ) ); // removes the characters that are not digits
        System.out.println(digits);

        ArrayList<String> letters = new ArrayList<>(Arrays.asList(str.split("" ) ) );
        letters.removeIf( p-> !Character.isLetter(p.charAt(0) ) );
        System.out.println(letters);

        ArrayList<String>  specialCharacter = new ArrayList<>(Arrays.asList(str.split("") ) );
        specialCharacter.removeIf( p -> Character.isLetterOrDigit(p.charAt(0) ) );
        System.out.println(specialCharacter);

        String ornek = "arzum123kucuk";

        String result ="";
         for (int i=0; i<=ornek.length()-1; i++ ){
             if (Character.isDigit(i)  ){
                 result+="*";
             }
             System.out.println(result);
         }





    }
}
