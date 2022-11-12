package day16_String;

import com.sun.corba.se.impl.legacy.connection.USLPort;
import com.sun.media.sound.SF2InstrumentRegion;

import java.util.Scanner;

public class equalWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1= scan.next();

        System.out.println("Enter your second word");
        String word2 = scan.next();
        /*
        if (word1.equals(word2)){
            System.out.println("They are equal");
        }else{
            System.out.println("not equal");
        }
        */

        String result = (word1.equals(word2.substring(0,word2.length()))) ? "Equal" : "Not equal";

        System.out.println(result);



    }
}
