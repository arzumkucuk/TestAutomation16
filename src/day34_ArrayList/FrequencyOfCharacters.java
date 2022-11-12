package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBCDDDDEEE";
        String result = "";    // A3B2C1D4E3

        ArrayList <String> list = new ArrayList<>(Arrays.asList(str.split(""))); // in order to be able to use frequency method

       // for(String each : str.split("")) // we get every character from str and at them into arraylist
        //    list.add(each); bunu commente aldik cunku Arrays.asList olarak formulu yukariya aldik

        System.out.println(list);

        for (String each : list){
            int frequency = Collections.frequency(list, each);

            if (!result.contains(each)) {
                result += each + frequency;
            }
        }
        System.out.println(result);

    }
}
